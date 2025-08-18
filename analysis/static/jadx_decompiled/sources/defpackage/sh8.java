package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class sh8 extends MediaSession.Callback {
    public final /* synthetic */ t68 a;

    public sh8(t68 t68Var) {
        this.a = t68Var;
    }

    public final vh8 a() {
        vh8 vh8Var;
        synchronized (this.a.a) {
            vh8Var = (vh8) ((WeakReference) this.a.c).get();
        }
        if (vh8Var == null || this.a != vh8Var.getCallback()) {
            return null;
        }
        return vh8Var;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        lcf lcfVar;
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        try {
            if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    ai8 ai8Var = vh8VarA.c;
                    pr6 pr6VarA = ai8Var.a();
                    bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, pr6VarA == null ? null : pr6VarA.asBinder());
                    synchronized (ai8Var.a) {
                        lcfVar = ai8Var.o;
                    }
                    tpa.E(bundle2, lcfVar);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                if (bundle != null) {
                    this.a.f((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                if (bundle != null) {
                    this.a.g((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                if (bundle != null) {
                    this.a.u((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                List list = vh8VarA.h;
                if (list != null && bundle != null) {
                    int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                    yh8 yh8Var = (i < 0 || i >= list.size()) ? null : (yh8) list.get(i);
                    if (yh8Var != null) {
                        this.a.u(yh8Var.a);
                    }
                }
            } else {
                this.a.h(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
        }
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        try {
            boolean zEquals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
            t68 t68Var = this.a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                    Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    bi8.a(bundle2);
                    t68Var.p(uri, bundle2);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                t68Var.q();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                if (bundle != null) {
                    String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                    Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    bi8.a(bundle3);
                    t68Var.r(string, bundle3);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                if (bundle != null) {
                    String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                    Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    bi8.a(bundle4);
                    t68Var.s(string2, bundle4);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                    Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    bi8.a(bundle5);
                    t68Var.t(uri2, bundle5);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                if (bundle != null) {
                    bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                    t68Var.getClass();
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                if (bundle != null) {
                    t68Var.A(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                if (bundle != null) {
                    t68Var.B(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                if (bundle != null) {
                    h5c h5cVar = (h5c) mf7.a(bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), h5c.CREATOR);
                    bi8.a(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                    t68Var.z(h5cVar);
                }
            } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                t68Var.i(str, bundle);
            } else if (bundle != null) {
                t68Var.x(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
            }
        } catch (BadParcelableException unused) {
        }
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.j();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return false;
        }
        boolean zK = this.a.k(intent);
        vh8VarA.a(null);
        return zK || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.l();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.m();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.n(str, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.o(str, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.p(uri, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.q();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.r(str, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.s(str, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        bi8.a(bundle);
        this.a.t(uri, bundle);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.v();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.w(j);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.x(f);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.y(h5c.a(rating));
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.C();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.D();
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.E(j);
        vh8VarA.a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        vh8 vh8VarA = a();
        if (vh8VarA == null) {
            return;
        }
        this.a.F();
        vh8VarA.a(null);
    }
}
