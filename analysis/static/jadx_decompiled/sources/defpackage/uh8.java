package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class uh8 extends Binder implements pr6 {
    public static final /* synthetic */ int d = 0;
    public final AtomicReference c;

    public uh8(wh8 wh8Var) {
        attachInterface(this, IMediaSession.DESCRIPTOR);
        this.c = new AtomicReference(wh8Var);
    }

    @Override // defpackage.pr6
    public final void B0(ja8 ja8Var) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void T(String str, Bundle bundle, zh8 zh8Var) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void W(mr6 mr6Var) {
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var == null || mr6Var == null) {
            return;
        }
        vh8Var.f.unregister(mr6Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (vh8Var.d) {
        }
    }

    @Override // defpackage.pr6
    public final void adjustVolume(int i, int i2, String str) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.pr6
    public final void fastForward() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void g0(mr6 mr6Var) {
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var == null || mr6Var == null) {
            return;
        }
        vh8Var.f.register(mr6Var, new vi8("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (vh8Var.d) {
        }
    }

    @Override // defpackage.pr6
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final long getFlags() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final PendingIntent getLaunchPendingIntent() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final hd8 getMetadata() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final i3b getPlaybackState() {
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var == null) {
            return null;
        }
        i3b i3bVar = vh8Var.g;
        hd8 hd8Var = vh8Var.i;
        if (i3bVar == null) {
            return i3bVar;
        }
        long j = i3bVar.b;
        long jA = -1;
        if (j == -1) {
            return i3bVar;
        }
        int i = i3bVar.a;
        if (i != 3 && i != 4 && i != 5) {
            return i3bVar;
        }
        if (i3bVar.s0 <= 0) {
            return i3bVar;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = ((long) (i3bVar.o * (jElapsedRealtime - r6))) + j;
        if (hd8Var != null && hd8Var.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            jA = hd8Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        long j3 = (jA < 0 || j2 <= jA) ? j2 < 0 ? 0L : j2 : jA;
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = i3bVar.t0;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new i3b(i3bVar.a, j3, i3bVar.c, i3bVar.o, i3bVar.X, i3bVar.Y, i3bVar.Z, jElapsedRealtime, arrayList, i3bVar.u0, i3bVar.v0);
    }

    @Override // defpackage.pr6
    public final List getQueue() {
        return null;
    }

    @Override // defpackage.pr6
    public final CharSequence getQueueTitle() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final int getRatingType() {
        return 0;
    }

    @Override // defpackage.pr6
    public final int getRepeatMode() {
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var != null) {
            return vh8Var.j;
        }
        return -1;
    }

    @Override // defpackage.pr6
    public final Bundle getSessionInfo() {
        Bundle bundle;
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var == null || (bundle = vh8Var.e) == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // defpackage.pr6
    public final int getShuffleMode() {
        vh8 vh8Var = (vh8) this.c.get();
        if (vh8Var != null) {
            return vh8Var.k;
        }
        return -1;
    }

    @Override // defpackage.pr6
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final upa getVolumeAttributes() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final boolean isCaptioningEnabled() {
        return false;
    }

    @Override // defpackage.pr6
    public final boolean isTransportControlEnabled() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void j(h5c h5cVar, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void k0(ja8 ja8Var) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void m(h5c h5cVar) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString(IMediaSession.DESCRIPTOR);
            return true;
        }
        mr6 mr6Var = null;
        mr6 mr6Var2 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                T(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? zh8.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                boolean zSendMediaButton = sendMediaButton(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zSendMediaButton ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mr6)) {
                        lr6 lr6Var = new lr6();
                        lr6Var.c = strongBinder;
                        mr6Var2 = lr6Var;
                    } else {
                        mr6Var2 = (mr6) iInterfaceQueryLocalInterface;
                    }
                }
                g0(mr6Var2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof mr6)) {
                        lr6 lr6Var2 = new lr6();
                        lr6Var2.c = strongBinder2;
                        mr6Var = lr6Var2;
                    } else {
                        mr6Var = (mr6) iInterfaceQueryLocalInterface2;
                    }
                }
                W(mr6Var);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                boolean zIsTransportControlEnabled = isTransportControlEnabled();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zIsTransportControlEnabled ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                String packageName = getPackageName();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                String tag = getTag();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                PendingIntent launchPendingIntent = getLaunchPendingIntent();
                parcel2.getClass();
                parcel2.writeNoException();
                if (launchPendingIntent != null) {
                    parcel2.writeInt(1);
                    launchPendingIntent.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                long flags = getFlags();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeLong(flags);
                return true;
            case 10:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                upa volumeAttributes = getVolumeAttributes();
                parcel2.getClass();
                parcel2.writeNoException();
                if (volumeAttributes != null) {
                    parcel2.writeInt(1);
                    volumeAttributes.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 11:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                play();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                playFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                playFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                playFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                skipToQueueItem(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                pause();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                stop();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                next();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                previous();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                fastForward();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                rewind();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                seekTo(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                m(parcel.readInt() != 0 ? h5c.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                sendCustomAction(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                hd8 metadata = getMetadata();
                parcel2.getClass();
                parcel2.writeNoException();
                if (metadata != null) {
                    parcel2.writeInt(1);
                    parcel2.writeBundle(metadata.a);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 28:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                i3b playbackState = getPlaybackState();
                parcel2.getClass();
                parcel2.writeNoException();
                if (playbackState != null) {
                    parcel2.writeInt(1);
                    playbackState.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 29:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                List queue = getQueue();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(queue);
                return true;
            case 30:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                CharSequence queueTitle = getQueueTitle();
                parcel2.getClass();
                parcel2.writeNoException();
                if (queueTitle != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(queueTitle, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                Bundle extras = getExtras();
                parcel2.getClass();
                parcel2.writeNoException();
                if (extras != null) {
                    parcel2.writeInt(1);
                    extras.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 32:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                int ratingType = getRatingType();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(ratingType);
                return true;
            case 33:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                prepare();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                prepareFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                prepareFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                prepareFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case LangUtils.HASH_OFFSET /* 37 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                int repeatMode = getRepeatMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case 38:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                setRepeatMode(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                B0(parcel.readInt() != 0 ? ja8.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                t0(parcel.readInt() != 0 ? ja8.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                k0(parcel.readInt() != 0 ? ja8.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                removeQueueItemAt(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 45:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                boolean zIsCaptioningEnabled = isCaptioningEnabled();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zIsCaptioningEnabled ? 1 : 0);
                return true;
            case 46:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                setCaptioningEnabled(parcel.readInt() != 0);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                int shuffleMode = getShuffleMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(shuffleMode);
                return true;
            case 48:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                setShuffleMode(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                setPlaybackSpeed(parcel.readFloat());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                Bundle sessionInfo = getSessionInfo();
                parcel2.getClass();
                parcel2.writeNoException();
                if (sessionInfo != null) {
                    parcel2.writeInt(1);
                    sessionInfo.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 51:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                j(parcel.readInt() != 0 ? h5c.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.pr6
    public final void pause() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void play() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void playFromMediaId(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void playFromSearch(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void playFromUri(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void prepare() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void prepareFromMediaId(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void prepareFromSearch(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void prepareFromUri(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void previous() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void removeQueueItemAt(int i) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void rewind() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void sendCustomAction(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final boolean sendMediaButton(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void setCaptioningEnabled(boolean z) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void setPlaybackSpeed(float f) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void setRepeatMode(int i) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void setShuffleMode(int i) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void setVolumeTo(int i, int i2, String str) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void skipToQueueItem(long j) {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void stop() {
        throw new AssertionError();
    }

    @Override // defpackage.pr6
    public final void t0(ja8 ja8Var, int i) {
        throw new AssertionError();
    }
}
