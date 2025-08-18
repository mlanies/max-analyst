package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import defpackage.d78;
import defpackage.lcf;
import defpackage.tpa;
import defpackage.tqf;
import defpackage.uqf;
import defpackage.wi8;
import defpackage.yi8;
import defpackage.zr6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final String DATA_CALLING_PID = "data_calling_pid";
    private static final String DATA_CALLING_UID = "data_calling_uid";
    private static final String DATA_EXTRAS = "data_extras";

    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;

    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    static final String TAG = "MediaSessionCompat";
    static int sMaxBitmapSize;
    private final ArrayList<OnActiveChangeListener> mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionImpl mImpl;

    public static abstract class Callback {
        CallbackHandler mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final Object mLock = new Object();
        final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21();
        WeakReference<MediaSessionImpl> mSessionImpl = new WeakReference<>(null);

        public class CallbackHandler extends Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

            public CallbackHandler(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaSessionImpl mediaSessionImpl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (Callback.this.mLock) {
                        mediaSessionImpl = Callback.this.mSessionImpl.get();
                        callback = Callback.this;
                        callbackHandler = callback.mCallbackHandler;
                    }
                    if (mediaSessionImpl == null || callback != mediaSessionImpl.getCallback() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.setCurrentControllerInfo((wi8) message.obj);
                    Callback.this.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.setCurrentControllerInfo(null);
                }
            }
        }

        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public MediaSessionCallbackApi21() {
            }

            private void clearCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo(null);
            }

            private MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (Callback.this.mLock) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.mSessionImpl.get();
                }
                if (mediaSessionImplApi21 == null || Callback.this != mediaSessionImplApi21.getCallback()) {
                    return null;
                }
                return mediaSessionImplApi21;
            }

            private void setCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = sessionImplIfCallbackIsSet.getSessionToken();
                        IMediaSession extraBinder = sessionToken.getExtraBinder();
                        if (extraBinder != null) {
                            iBinderAsBinder = extraBinder.asBinder();
                        }
                        bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iBinderAsBinder);
                        tpa.E(bundle2, sessionToken.getSession2Token());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                        Callback.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (!str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                        Callback.this.onCommand(str, bundle, resultReceiver);
                    } else if (sessionImplIfCallbackIsSet.mQueue != null) {
                        int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                        if (i >= 0 && i < sessionImplIfCallbackIsSet.mQueue.size()) {
                            queueItem = sessionImplIfCallbackIsSet.mQueue.get(i);
                        }
                        if (queueItem != null) {
                            Callback.this.onRemoveQueueItem(queueItem.getDescription());
                        }
                    }
                } catch (BadParcelableException unused) {
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                        Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Callback.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                        Callback.this.onPrepare();
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        Callback.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle4);
                        Callback.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                        Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle5);
                        Callback.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                        Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                        Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING);
                        Bundle bundle6 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle6);
                        Callback.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                        Callback.this.onSetPlaybackSpeed(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                    } else {
                        Callback.this.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onFastForward();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return false;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                boolean zOnMediaButtonEvent = Callback.this.onMediaButtonEvent(intent);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPause();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPlay();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPlayFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPlayFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPlayFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPrepare();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPrepareFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPrepareFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onPrepareFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onRewind();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSeekTo(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSetPlaybackSpeed(f);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSetRating(RatingCompat.fromRating(rating));
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSkipToNext();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSkipToPrevious();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onSkipToQueueItem(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                Callback.this.onStop();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionImpl mediaSessionImpl, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z = playbackState != null && playbackState.getState() == 3;
                boolean z2 = (516 & actions) != 0;
                boolean z3 = (actions & 514) != 0;
                if (z && z3) {
                    onPause();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return false;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void setSessionImpl(MediaSessionImpl mediaSessionImpl, Handler handler) {
            synchronized (this.mLock) {
                try {
                    this.mSessionImpl = new WeakReference<>(mediaSessionImpl);
                    CallbackHandler callbackHandler = this.mCallbackHandler;
                    CallbackHandler callbackHandler2 = null;
                    if (callbackHandler != null) {
                        callbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (mediaSessionImpl != null && handler != null) {
                        callbackHandler2 = new CallbackHandler(handler.getLooper());
                    }
                    this.mCallbackHandler = callbackHandler2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    public interface MediaSessionImpl {
        Callback getCallback();

        String getCallingPackage();

        wi8 getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z);

        void setCallback(Callback callback, Handler handler);

        void setCaptioningEnabled(boolean z);

        void setCurrentControllerInfo(wi8 wi8Var);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i);

        void setPlaybackToRemote(uqf uqfVar);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i);

        void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler);

        void setRepeatMode(int i);

        void setSessionActivity(PendingIntent pendingIntent);

        void setShuffleMode(int i);
    }

    public static class MediaSessionImplApi18 extends MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;

        public MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, lcf lcfVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, lcfVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 256) != 0 ? rccTransportControlFlagsFromActions | 256 : rccTransportControlFlagsFromActions;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                try {
                    this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    sIsMbrPendingIntentSupported = false;
                }
            }
            if (sIsMbrPendingIntentSupported) {
                return;
            }
            super.registerMediaButtonEventReceiver(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setPlaybackPositionUpdateListener(null);
            } else {
                this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j) {
                        MediaSessionImplApi18.this.postToHandler(18, -1, -1, Long.valueOf(j), null);
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            long position = playbackStateCompat.getPosition();
            float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.getState() == 3) {
                long j = 0;
                if (position > 0) {
                    if (lastPositionUpdateTime > 0) {
                        j = jElapsedRealtime - lastPositionUpdateTime;
                        if (playbackSpeed > 0.0f && playbackSpeed != 1.0f) {
                            j = (long) (j * playbackSpeed);
                        }
                    }
                    position += j;
                }
            }
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
            }
        }
    }

    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
        public MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, lcf lcfVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, lcfVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) throws IllegalArgumentException {
            RemoteControlClient.MetadataEditor metadataEditorBuildRccMetadata = super.buildRccMetadata(bundle);
            PlaybackStateCompat playbackStateCompat = this.mState;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.getActions()) & 128) != 0) {
                metadataEditorBuildRccMetadata.addEditableKey(268435457);
            }
            if (bundle == null) {
                return metadataEditorBuildRccMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
                metadataEditorBuildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
                metadataEditorBuildRccMetadata.putObject(HttpStatus.SC_SWITCHING_PROTOCOLS, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
                metadataEditorBuildRccMetadata.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
            }
            return metadataEditorBuildRccMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 128) != 0 ? rccTransportControlFlagsFromActions | 512 : rccTransportControlFlagsFromActions;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setMetadataUpdateListener(null);
            } else {
                this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i, Object obj) {
                        if (i == 268435457 && (obj instanceof Rating)) {
                            MediaSessionImplApi19.this.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), null);
                        }
                    }
                });
            }
        }
    }

    public static class MediaSessionImplApi22 extends MediaSessionImplApi21 {
        public MediaSessionImplApi22(Context context, String str, lcf lcfVar, Bundle bundle) {
            super(context, str, lcfVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mSessionFwk.setRatingType(i);
        }

        public MediaSessionImplApi22(Object obj) {
            super(obj);
        }
    }

    public static class MediaSessionImplApi28 extends MediaSessionImplApi22 {
        public MediaSessionImplApi28(Context context, String str, lcf lcfVar, Bundle bundle) {
            super(context, str, lcfVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public final wi8 getCurrentControllerInfo() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo = this.mSessionFwk.getCurrentControllerInfo();
            wi8 wi8Var = new wi8();
            String packageName = currentControllerInfo.getPackageName();
            if (packageName == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(packageName)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            wi8Var.a = new yi8(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
            return wi8Var;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(wi8 wi8Var) {
        }

        public MediaSessionImplApi28(Object obj) {
            super(obj);
        }
    }

    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(Context context, String str, lcf lcfVar, Bundle bundle) {
            super(context, str, lcfVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }

        public MediaSessionImplApi29(Object obj) {
            super(obj);
            this.mSessionInfo = ((MediaSession) obj).getController().getSessionInfo();
        }
    }

    public static class MediaSessionImplBase implements MediaSessionImpl {
        static final int RCC_PLAYSTATE_NONE = 0;
        final AudioManager mAudioManager;
        volatile Callback mCallback;
        boolean mCaptioningEnabled;
        private final Context mContext;
        Bundle mExtras;
        private MessageHandler mHandler;
        int mLocalStream;
        private final ComponentName mMediaButtonReceiverComponentName;
        private final PendingIntent mMediaButtonReceiverIntent;
        MediaMetadataCompat mMetadata;
        List<QueueItem> mQueue;
        CharSequence mQueueTitle;
        int mRatingType;
        final RemoteControlClient mRcc;
        RegistrationCallbackHandler mRegistrationCallbackHandler;
        private wi8 mRemoteUserInfo;
        int mRepeatMode;
        PendingIntent mSessionActivity;
        final Bundle mSessionInfo;
        int mShuffleMode;
        PlaybackStateCompat mState;
        private final MediaSessionStub mStub;
        private final Token mToken;
        uqf mVolumeProvider;
        int mVolumeType;
        final Object mLock = new Object();
        final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
        boolean mDestroyed = false;
        boolean mIsActive = false;
        int mFlags = 3;
        private tqf mVolumeCallback = new tqf() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
            public void onVolumeChanged(uqf uqfVar) {
                MediaSessionImplBase.this.getClass();
                MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                int i = mediaSessionImplBase.mVolumeType;
                int i2 = mediaSessionImplBase.mLocalStream;
                throw null;
            }
        };

        public static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        public static class MediaSessionStub extends IMediaSession.Stub {
            private final AtomicReference<MediaSessionImplBase> mMediaSessionImplRef;
            private final String mPackageName;
            private final String mTag;

            public MediaSessionStub(MediaSessionImplBase mediaSessionImplBase, String str, String str2) {
                this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplBase);
                this.mPackageName = str;
                this.mTag = str2;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                postToHandler(26, mediaDescriptionCompat, i, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.adjustVolume(i, i2);
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                postToHandler(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                Bundle bundle;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    bundle = mediaSessionImplBase.mExtras;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                long j;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return 0L;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    j = mediaSessionImplBase.mFlags;
                }
                return j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    pendingIntent = mediaSessionImplBase.mSessionActivity;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mMetadata;
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                return this.mPackageName;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    playbackStateCompat = mediaSessionImplBase.mState;
                    mediaMetadataCompat = mediaSessionImplBase.mMetadata;
                }
                return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    list = mediaSessionImplBase.mQueue;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mQueueTitle;
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRatingType;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRepeatMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null || mediaSessionImplBase.mSessionInfo == null) {
                    return null;
                }
                return new Bundle(mediaSessionImplBase.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mShuffleMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                return this.mTag;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                ParcelableVolumeInfo parcelableVolumeInfo;
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    try {
                        int i = mediaSessionImplBase.mVolumeType;
                        int i2 = mediaSessionImplBase.mLocalStream;
                        if (i == 2) {
                            throw null;
                        }
                        parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, 2, mediaSessionImplBase.mAudioManager.getStreamMaxVolume(i2), mediaSessionImplBase.mAudioManager.getStreamVolume(i2));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parcelableVolumeInfo;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                return mediaSessionImplBase != null && mediaSessionImplBase.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                postToHandler(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                postToHandler(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                postToHandler(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) {
                postToHandler(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) {
                postToHandler(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) {
                postToHandler(10, uri, bundle);
            }

            public void postToHandler(int i) {
                postToHandler(i, null, 0, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                postToHandler(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) {
                postToHandler(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) {
                postToHandler(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) {
                postToHandler(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                postToHandler(15);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) {
                postToHandler(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                postToHandler(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                mediaSessionImplBase.mControllerCallbacks.register(iMediaControllerCallback, new wi8(mediaSessionImplBase.getPackageNameForUid(callingUid), callingPid, callingUid));
                synchronized (mediaSessionImplBase.mLock) {
                    try {
                        RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                postToHandler(28, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                postToHandler(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) {
                postToHandler(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.mResultReceiver));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                postToHandler(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                postToHandler(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) {
                postToHandler(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) {
                postToHandler(32, Float.valueOf(f));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) {
                postToHandler(23, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) {
                postToHandler(30, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.setVolumeTo(i, i2);
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                postToHandler(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                postToHandler(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return;
                }
                mediaSessionImplBase.mControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (mediaSessionImplBase.mLock) {
                    try {
                        RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplBase.mRegistrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void postToHandler(int i, int i2) {
                postToHandler(i, null, i2, null);
            }

            public void postToHandler(int i, Object obj) {
                postToHandler(i, obj, 0, null);
            }

            public void postToHandler(int i, Object obj, Bundle bundle) {
                postToHandler(i, obj, 0, bundle);
            }

            public void postToHandler(int i, Object obj, int i2, Bundle bundle) {
                MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.postToHandler(i, i2, 0, obj, bundle);
                }
            }
        }

        public class MessageHandler extends Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_PLAYBACK_SPEED = 32;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;

            public MessageHandler(Looper looper) {
                super(looper);
            }

            private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.mState;
                long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == KEYCODE_MEDIA_PLAY) {
                    if ((4 & actions) != 0) {
                        callback.onPlay();
                    }
                    return;
                }
                if (keyCode == KEYCODE_MEDIA_PAUSE) {
                    if ((2 & actions) != 0) {
                        callback.onPause();
                        return;
                    }
                    return;
                }
                switch (keyCode) {
                    case 86:
                        if ((1 & actions) != 0) {
                            callback.onStop();
                            break;
                        }
                        break;
                    case 87:
                        if ((32 & actions) != 0) {
                            callback.onSkipToNext();
                            break;
                        }
                        break;
                    case 88:
                        if ((16 & actions) != 0) {
                            callback.onSkipToPrevious();
                            break;
                        }
                        break;
                    case 89:
                        if ((8 & actions) != 0) {
                            callback.onRewind();
                            break;
                        }
                        break;
                    case 90:
                        if ((64 & actions) != 0) {
                            callback.onFastForward();
                            break;
                        }
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Callback callback = MediaSessionImplBase.this.mCallback;
                if (callback == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                MediaSessionImplBase.this.setCurrentControllerInfo(new wi8(data.getString(MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt(MediaSessionCompat.DATA_CALLING_PID), data.getInt(MediaSessionCompat.DATA_CALLING_UID)));
                Bundle bundle = data.getBundle(MediaSessionCompat.DATA_EXTRAS);
                MediaSessionCompat.ensureClassLoader(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            Command command = (Command) message.obj;
                            callback.onCommand(command.command, command.extras, command.stub);
                            break;
                        case 2:
                            MediaSessionImplBase.this.adjustVolume(message.arg1, 0);
                            break;
                        case 3:
                            callback.onPrepare();
                            break;
                        case 4:
                            callback.onPrepareFromMediaId((String) message.obj, bundle);
                            break;
                        case 5:
                            callback.onPrepareFromSearch((String) message.obj, bundle);
                            break;
                        case 6:
                            callback.onPrepareFromUri((Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.onPlay();
                            break;
                        case 8:
                            callback.onPlayFromMediaId((String) message.obj, bundle);
                            break;
                        case 9:
                            callback.onPlayFromSearch((String) message.obj, bundle);
                            break;
                        case 10:
                            callback.onPlayFromUri((Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.onSkipToQueueItem(((Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.onPause();
                            break;
                        case 13:
                            callback.onStop();
                            break;
                        case 14:
                            callback.onSkipToNext();
                            break;
                        case 15:
                            callback.onSkipToPrevious();
                            break;
                        case 16:
                            callback.onFastForward();
                            break;
                        case 17:
                            callback.onRewind();
                            break;
                        case MSG_SEEK_TO /* 18 */:
                            callback.onSeekTo(((Long) message.obj).longValue());
                            break;
                        case MSG_RATE /* 19 */:
                            callback.onSetRating((RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.onCustomAction((String) message.obj, bundle);
                            break;
                        case MSG_MEDIA_BUTTON /* 21 */:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.onMediaButtonEvent(intent)) {
                                onMediaButtonEvent(keyEvent, callback);
                                break;
                            }
                            break;
                        case MSG_SET_VOLUME /* 22 */:
                            MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);
                            break;
                        case MSG_SET_REPEAT_MODE /* 23 */:
                            callback.onSetRepeatMode(message.arg1);
                            break;
                        case MSG_ADD_QUEUE_ITEM /* 25 */:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case MSG_ADD_QUEUE_ITEM_AT /* 26 */:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case MSG_REMOVE_QUEUE_ITEM /* 27 */:
                            callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case MSG_REMOVE_QUEUE_ITEM_AT /* 28 */:
                            List<QueueItem> list = MediaSessionImplBase.this.mQueue;
                            if (list != null) {
                                int i = message.arg1;
                                QueueItem queueItem = (i < 0 || i >= list.size()) ? null : MediaSessionImplBase.this.mQueue.get(message.arg1);
                                if (queueItem != null) {
                                    callback.onRemoveQueueItem(queueItem.getDescription());
                                    break;
                                }
                            }
                            break;
                        case MSG_SET_CAPTIONING_ENABLED /* 29 */:
                            callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.onSetShuffleMode(message.arg1);
                            break;
                        case MSG_RATE_EXTRA /* 31 */:
                            callback.onSetRating((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    MediaSessionImplBase.this.setCurrentControllerInfo(null);
                }
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, lcf lcfVar, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.mContext = context;
            this.mSessionInfo = bundle;
            this.mAudioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.mMediaButtonReceiverComponentName = componentName;
            this.mMediaButtonReceiverIntent = pendingIntent;
            MediaSessionStub mediaSessionStub = new MediaSessionStub(this, context.getPackageName(), str);
            this.mStub = mediaSessionStub;
            this.mToken = new Token(mediaSessionStub, null, lcfVar);
            this.mRatingType = 0;
            this.mVolumeType = 1;
            this.mLocalStream = 3;
            this.mRcc = new RemoteControlClient(pendingIntent);
        }

        private void sendCaptioningEnabled(boolean z) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendEvent(String str, Bundle bundle) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onEvent(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendExtras(Bundle bundle) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onExtrasChanged(bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendMetadata(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onMetadataChanged(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueue(List<QueueItem> list) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onQueueChanged(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueueTitle(CharSequence charSequence) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onQueueTitleChanged(charSequence);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendRepeatMode(int i) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendSessionDestroyed() {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onSessionDestroyed();
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
                this.mControllerCallbacks.kill();
            }
        }

        private void sendShuffleMode(int i) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        public void adjustVolume(int i, int i2) {
            if (this.mVolumeType == 2) {
                return;
            }
            this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
        }

        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) throws IllegalArgumentException {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.mRcc.editMetadata(true);
            if (bundle == null) {
                return metadataEditorEditMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {
                Bitmap bitmapCopy = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);
                if (bitmapCopy != null) {
                    bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
            } else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
                Bitmap bitmapCopy2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
                if (bitmapCopy2 != null) {
                    bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                metadataEditorEditMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                metadataEditorEditMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                metadataEditorEditMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                metadataEditorEditMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {
                metadataEditorEditMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                metadataEditorEditMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {
                metadataEditorEditMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {
                metadataEditorEditMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                metadataEditorEditMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {
                metadataEditorEditMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                metadataEditorEditMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {
                metadataEditorEditMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                metadataEditorEditMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));
            }
            return metadataEditorEditMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public wi8 getCurrentControllerInfo() {
            wi8 wi8Var;
            synchronized (this.mLock) {
                wi8Var = this.mRemoteUserInfo;
            }
            return wi8Var;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return null;
        }

        public String getPackageNameForUid(int i) {
            String nameForUid = this.mContext.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.mLock) {
                playbackStateCompat = this.mState;
            }
            return playbackStateCompat;
        }

        public int getRccStateFromState(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int getRccTransportControlFlagsFromActions(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mIsActive;
        }

        public void postToHandler(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.mLock) {
                try {
                    MessageHandler messageHandler = this.mHandler;
                    if (messageHandler != null) {
                        Message messageObtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
                        Bundle bundle2 = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle2.putInt(MediaSessionCompat.DATA_CALLING_UID, callingUid);
                        bundle2.putString(MediaSessionCompat.DATA_CALLING_PACKAGE, getPackageNameForUid(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, callingPid);
                        } else {
                            bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, -1);
                        }
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.DATA_EXTRAS, bundle);
                        }
                        messageObtainMessage.setData(bundle2);
                        messageObtainMessage.sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mIsActive = false;
            this.mDestroyed = true;
            updateMbrAndRcc();
            sendSessionDestroyed();
            setCallback(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String str, Bundle bundle) {
            sendEvent(str, bundle);
        }

        public void sendVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onVolumeInfoChanged(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            if (z == this.mIsActive) {
                return;
            }
            this.mIsActive = z;
            updateMbrAndRcc();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    MessageHandler messageHandler = this.mHandler;
                    if (messageHandler != null) {
                        messageHandler.removeCallbacksAndMessages(null);
                    }
                    this.mHandler = (callback == null || handler == null) ? null : new MessageHandler(handler.getLooper());
                    if (this.mCallback != callback && this.mCallback != null) {
                        this.mCallback.setSessionImpl(null, null);
                    }
                    this.mCallback = callback;
                    if (this.mCallback != null) {
                        this.mCallback.setSessionImpl(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                sendCaptioningEnabled(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(wi8 wi8Var) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = wi8Var;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
            sendExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i) {
            synchronized (this.mLock) {
                this.mFlags = i | 3;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.sMaxBitmapSize).build();
            }
            synchronized (this.mLock) {
                this.mMetadata = mediaMetadataCompat;
            }
            sendMetadata(mediaMetadataCompat);
            if (this.mIsActive) {
                buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                this.mState = playbackStateCompat;
            }
            sendState(playbackStateCompat);
            if (this.mIsActive) {
                if (playbackStateCompat == null) {
                    this.mRcc.setPlaybackState(0);
                    this.mRcc.setTransportControlFlags(0);
                } else {
                    setRccState(playbackStateCompat);
                    this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            this.mLocalStream = i;
            this.mVolumeType = 1;
            int i2 = this.mVolumeType;
            int i3 = this.mLocalStream;
            sendVolumeInfoChanged(new ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(uqf uqfVar) {
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            sendQueue(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.mQueueTitle = charSequence;
            sendQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (registrationCallback != null) {
                        this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                    } else {
                        this.mRegistrationCallbackHandler = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                sendRepeatMode(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            synchronized (this.mLock) {
                this.mSessionActivity = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                sendShuffleMode(i);
            }
        }

        public void setVolumeTo(int i, int i2) {
            if (this.mVolumeType == 2) {
                return;
            }
            this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
        }

        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
        }

        public void updateMbrAndRcc() {
            if (!this.mIsActive) {
                unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mRcc.setPlaybackState(0);
                this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
            } else {
                registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mAudioManager.registerRemoteControlClient(this.mRcc);
                setMetadata(this.mMetadata);
                setPlaybackState(this.mState);
            }
        }
    }

    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        public static class Api21Impl {
            private Api21Impl() {
            }

            public static MediaSession.QueueItem createQueueItem(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static MediaDescription getDescription(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long getQueueId(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(queueItem)), Api21Impl.getQueueId(queueItem));
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public long getQueueId() {
            return this.mId;
        }

        public Object getQueueItem() {
            MediaSession.QueueItem queueItem = this.mItemFwk;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItemCreateQueueItem = Api21Impl.createQueueItem((MediaDescription) this.mDescription.getMediaDescription(), this.mId);
            this.mItemFwk = queueItemCreateQueueItem;
            return queueItemCreateQueueItem;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.mDescription);
            sb.append(", Id=");
            return zr6.k(sb, this.mId, " }");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j;
            this.mItemFwk = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }
    }

    public interface RegistrationCallback {
        void onCallbackRegistered(int i, int i2);

        void onCallbackUnregistered(int i, int i2);
    }

    public static final class RegistrationCallbackHandler extends Handler {
        private static final int MSG_CALLBACK_REGISTERED = 1001;
        private static final int MSG_CALLBACK_UNREGISTERED = 1002;
        private final RegistrationCallback mCallback;

        public RegistrationCallbackHandler(Looper looper, RegistrationCallback registrationCallback) {
            super(looper);
            this.mCallback = registrationCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1001) {
                this.mCallback.onCallbackRegistered(message.arg1, message.arg2);
            } else {
                if (i != MSG_CALLBACK_UNREGISTERED) {
                    return;
                }
                this.mCallback.onCallbackUnregistered(message.arg1, message.arg2);
            }
        }

        public void postCallbackRegistered(int i, int i2) {
            obtainMessage(1001, i, i2).sendToTarget();
        }

        public void postCallbackUnregistered(int i, int i2) {
            obtainMessage(MSG_CALLBACK_UNREGISTERED, i, i2).sendToTarget();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private IMediaSession mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        private lcf mSession2Token;

        public Token(Object obj) {
            this(obj, null, null);
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER));
            lcf lcfVarW = tpa.w(bundle);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            if (token == null) {
                return null;
            }
            return new Token(token.mInner, iMediaSessionAsInterface, lcfVarW);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                return token.mInner == null;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public IMediaSession getExtraBinder() {
            IMediaSession iMediaSession;
            synchronized (this.mLock) {
                iMediaSession = this.mExtraBinder;
            }
            return iMediaSession;
        }

        public lcf getSession2Token() {
            lcf lcfVar;
            synchronized (this.mLock) {
                lcfVar = this.mSession2Token;
            }
            return lcfVar;
        }

        public Object getToken() {
            return this.mInner;
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(IMediaSession iMediaSession) {
            synchronized (this.mLock) {
                this.mExtraBinder = iMediaSession;
            }
        }

        public void setSession2Token(lcf lcfVar) {
            synchronized (this.mLock) {
                this.mSession2Token = lcfVar;
            }
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            synchronized (this.mLock) {
                try {
                    IMediaSession iMediaSession = this.mExtraBinder;
                    if (iMediaSession != null) {
                        bundle.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                    }
                    lcf lcfVar = this.mSession2Token;
                    if (lcfVar != null) {
                        tpa.E(bundle, lcfVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public Token(Object obj, IMediaSession iMediaSession, lcf lcfVar) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = iMediaSession;
            this.mSession2Token = lcfVar;
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, new MediaSessionImplApi29(obj));
    }

    public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getLastPositionUpdateTime() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - r0)));
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), (j < 0 || position <= j) ? position < 0 ? 0L : position : j, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.add(onActiveChangeListener);
    }

    public String getCallingPackage() {
        return this.mImpl.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public final wi8 getCurrentControllerInfo() {
        return this.mImpl.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void release() {
        this.mImpl.release();
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.remove(onActiveChangeListener);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.mImpl.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z) {
        this.mImpl.setActive(z);
        Iterator<OnActiveChangeListener> it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCaptioningEnabled(boolean z) {
        this.mImpl.setCaptioningEnabled(z);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public void setFlags(int i) {
        this.mImpl.setFlags(i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i) {
        this.mImpl.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(uqf uqfVar) {
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void setQueue(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.getQueueId()))) {
                    queueItem.getQueueId();
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.mImpl.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mImpl.setRatingType(i);
    }

    public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
        this.mImpl.setRegistrationCallback(registrationCallback, handler);
    }

    public void setRepeatMode(int i) {
        this.mImpl.setRepeatMode(i);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i) {
        this.mImpl.setShuffleMode(i);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver mResultReceiver;

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public void setCallback(Callback callback, Handler handler) {
        if (callback == null) {
            this.mImpl.setCallback(null, null);
            return;
        }
        MediaSessionImpl mediaSessionImpl = this.mImpl;
        if (handler == null) {
            handler = new Handler();
        }
        mediaSessionImpl.setCallback(callback, handler);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, lcf lcfVar) {
        this.mActiveListeners = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i = d78.a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        listQueryBroadcastReceivers.size();
                        componentName = null;
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                MediaSessionImplApi29 mediaSessionImplApi29 = new MediaSessionImplApi29(context, str, lcfVar, bundle);
                this.mImpl = mediaSessionImplApi29;
                setCallback(new Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.1
                }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                mediaSessionImplApi29.setMediaButtonReceiver(pendingIntent);
                this.mController = new MediaControllerCompat(context, this);
                if (sMaxBitmapSize == 0) {
                    sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static class MediaSessionImplApi21 implements MediaSessionImpl {
        Callback mCallback;
        boolean mCaptioningEnabled;
        final ExtraSession mExtraSession;
        MediaMetadataCompat mMetadata;
        PlaybackStateCompat mPlaybackState;
        List<QueueItem> mQueue;
        int mRatingType;
        RegistrationCallbackHandler mRegistrationCallbackHandler;
        wi8 mRemoteUserInfo;
        int mRepeatMode;
        final MediaSession mSessionFwk;
        Bundle mSessionInfo;
        int mShuffleMode;
        final Token mToken;
        final Object mLock = new Object();
        boolean mDestroyed = false;
        final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();

        public static class ExtraSession extends IMediaSession.Stub {
            private final AtomicReference<MediaSessionImplApi21> mMediaSessionImplRef;

            public ExtraSession(MediaSessionImplApi21 mediaSessionImplApi21) {
                this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionImplApi21);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRatingType;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRepeatMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21.mSessionInfo == null) {
                    return null;
                }
                return new Bundle(mediaSessionImplApi21.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mShuffleMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                return mediaSessionImplApi21 != null && mediaSessionImplApi21.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 == null) {
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                mediaSessionImplApi21.mExtraControllerCallbacks.register(iMediaControllerCallback, new wi8("android.media.session.MediaController", callingPid, callingUid));
                synchronized (mediaSessionImplApi21.mLock) {
                    try {
                        RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void release() {
                this.mMediaSessionImplRef.set(null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 == null) {
                    return;
                }
                mediaSessionImplApi21.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (mediaSessionImplApi21.mLock) {
                    try {
                        RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi21.mRegistrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public MediaSessionImplApi21(Context context, String str, lcf lcfVar, Bundle bundle) {
            MediaSession mediaSessionCreateFwkMediaSession = createFwkMediaSession(context, str, bundle);
            this.mSessionFwk = mediaSessionCreateFwkMediaSession;
            ExtraSession extraSession = new ExtraSession(this);
            this.mExtraSession = extraSession;
            this.mToken = new Token(mediaSessionCreateFwkMediaSession.getSessionToken(), extraSession, lcfVar);
            this.mSessionInfo = bundle;
            setFlags(3);
        }

        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            try {
                return (String) this.mSessionFwk.getClass().getMethod("getCallingPackage", null).invoke(this.mSessionFwk, null);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public wi8 getCurrentControllerInfo() {
            wi8 wi8Var;
            synchronized (this.mLock) {
                wi8Var = this.mRemoteUserInfo;
            }
            return wi8Var;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return this.mSessionFwk;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            return this.mPlaybackState;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mSessionFwk.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mDestroyed = true;
            this.mExtraControllerCallbacks.kill();
            this.mSessionFwk.setCallback(null);
            this.mExtraSession.release();
            this.mSessionFwk.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String str, Bundle bundle) {
            this.mSessionFwk.sendSessionEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            this.mSessionFwk.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    this.mCallback = callback;
                    this.mSessionFwk.setCallback(callback == null ? null : callback.mCallbackFwk, handler);
                    if (callback != null) {
                        callback.setSessionImpl(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(wi8 wi8Var) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = wi8Var;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.mSessionFwk.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @SuppressLint({"WrongConstant"})
        public void setFlags(int i) {
            this.mSessionFwk.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            this.mMetadata = mediaMetadataCompat;
            this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            this.mPlaybackState = playbackStateCompat;
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.mExtraControllerCallbacks.finishBroadcast();
            }
            this.mSessionFwk.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.getPlaybackState());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.mSessionFwk.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(uqf uqfVar) {
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            if (list == null) {
                this.mSessionFwk.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().getQueueItem());
            }
            this.mSessionFwk.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.mSessionFwk.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                try {
                    RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (registrationCallback != null) {
                        this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                    } else {
                        this.mRegistrationCallbackHandler = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            this.mSessionFwk.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        public MediaSessionImplApi21(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.mSessionFwk = mediaSession;
                ExtraSession extraSession = new ExtraSession(this);
                this.mExtraSession = extraSession;
                this.mToken = new Token(mediaSession.getSessionToken(), extraSession);
                this.mSessionInfo = null;
                setFlags(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
    }

    private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
        this.mActiveListeners = new ArrayList<>();
        this.mImpl = mediaSessionImpl;
        this.mController = new MediaControllerCompat(context, this);
    }
}
