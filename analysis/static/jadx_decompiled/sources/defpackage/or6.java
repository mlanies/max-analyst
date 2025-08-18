package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* loaded from: classes.dex */
public final class or6 implements qr6 {
    public IBinder c;

    @Override // defpackage.qr6
    public final void A0(kr6 kr6Var, int i, int i2, int i3, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            this.c.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void B(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void C(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void C0(kr6 kr6Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.c.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void D0(kr6 kr6Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void E(kr6 kr6Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void E0(kr6 kr6Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void F(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void G(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void I(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void J(kr6 kr6Var, int i, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void K(kr6 kr6Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.c.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void L(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void N(kr6 kr6Var, int i, int i2, int i3, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeStrongBinder(iBinder);
            this.c.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void O(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void P(kr6 kr6Var, int i, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.c.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void Q(kr6 kr6Var, int i, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            this.c.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void S(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void U(kr6 kr6Var, int i, int i2, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeStrongBinder(iBinder);
            this.c.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void V(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void X(kr6 kr6Var, int i, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeLong(j);
            this.c.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void Y(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void Z(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void a(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void a0(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.qr6
    public final void c0(kr6 kr6Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void d(kr6 kr6Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void d0(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void e(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void e0(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void i(kr6 kr6Var, int i, Bundle bundle, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            parcelObtain.writeLong(j);
            this.c.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void i0(kr6 kr6Var, int i, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, surface);
            this.c.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void j0(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void l0(kr6 kr6Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void m0(kr6 kr6Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            this.c.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void n0(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void o0(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void p(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void p0(kr6 kr6Var, int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            fp3.b(parcelObtain, bundle2);
            this.c.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void r0(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void s(kr6 kr6Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.c.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void s0(kr6 kr6Var, int i, boolean z, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(i2);
            this.c.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void u0(kr6 kr6Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            fp3.b(parcelObtain, bundle);
            this.c.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void v(kr6 kr6Var, int i, IBinder iBinder, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.c.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void v0(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void w(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void w0(kr6 kr6Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void x(kr6 kr6Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.c.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void x0(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void y(kr6 kr6Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.c.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void z(kr6 kr6Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            this.c.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.qr6
    public final void z0(kr6 kr6Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(kr6Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.c.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
