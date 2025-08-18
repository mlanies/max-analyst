package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class nr6 implements pr6 {
    public IBinder c;

    @Override // defpackage.pr6
    public final void T(String str, Bundle bundle, zh8 zh8Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (zh8Var != null) {
                parcelObtain.writeInt(1);
                zh8Var.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void W(mr6 mr6Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder(mr6Var != null ? mr6Var.asBinder() : null);
            if (!this.c.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void adjustVolume(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            if (!this.c.transact(11, parcelObtain, parcelObtain2, 0)) {
                int i3 = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.pr6
    public final void fastForward() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(22, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void g0(mr6 mr6Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeStrongBinder(mr6Var != null ? mr6Var.asBinder() : null);
            if (!this.c.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final Bundle getExtras() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(31, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final long getFlags() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(9, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final hd8 getMetadata() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(27, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? hd8.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final String getPackageName() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(6, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final i3b getPlaybackState() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? i3b.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final List getQueue() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(29, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(yh8.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final CharSequence getQueueTitle() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(30, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final int getRatingType() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(32, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final int getRepeatMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final int getShuffleMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final upa getVolumeAttributes() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(10, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? upa.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final boolean isCaptioningEnabled() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void k0(ja8 ja8Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (ja8Var != null) {
                parcelObtain.writeInt(1);
                ja8Var.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(43, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void next() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(20, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void pause() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(18, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void play() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(13, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void playFromMediaId(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(14, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void playFromSearch(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(15, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void playFromUri(Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(16, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void prepare() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(33, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void prepareFromMediaId(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(34, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void prepareFromSearch(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(35, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void prepareFromUri(Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(36, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void previous() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(21, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void rewind() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(23, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void seekTo(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeLong(j);
            if (!this.c.transact(24, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void sendCustomAction(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(26, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final boolean sendMediaButton(KeyEvent keyEvent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (keyEvent != null) {
                parcelObtain.writeInt(1);
                keyEvent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.pr6
    public final void setPlaybackSpeed(float f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeFloat(f);
            if (!this.c.transact(49, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void setRepeatMode(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(39, parcelObtain, parcelObtain2, 0)) {
                int i2 = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void setShuffleMode(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(48, parcelObtain, parcelObtain2, 0)) {
                int i2 = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void setVolumeTo(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            if (!this.c.transact(12, parcelObtain, parcelObtain2, 0)) {
                int i3 = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void skipToQueueItem(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            parcelObtain.writeLong(j);
            if (!this.c.transact(17, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void stop() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(19, parcelObtain, parcelObtain2, 0)) {
                int i = uh8.d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pr6
    public final void t0(ja8 ja8Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (ja8Var != null) {
                parcelObtain.writeInt(1);
                ja8Var.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            if (!this.c.transact(42, parcelObtain, parcelObtain2, 0)) {
                int i2 = uh8.d;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
