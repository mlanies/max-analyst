package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class moa implements poa {
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public final Object o;
    public Object s0;

    public moa(rx0 rx0Var, ey3 ey3Var) {
        this.a = rx0Var;
        this.b = ey3Var;
        this.c = new kw4(rx0Var.c, rx0Var.d, 1.0d);
        this.o = new kw4(rx0Var.f, rx0Var.g, 0.0d);
        this.X = new kw4(rx0Var.k, 0.0d, 2);
        this.Y = new kw4(rx0Var.j, 0.0d, 2);
        this.Z = new kw4(rx0Var.w, rx0Var.x, 4);
        this.s0 = new kw4(rx0Var.y, rx0Var.z, 4);
    }

    @Override // defpackage.poa
    public double a(double d, double d2, double d3, boolean z) {
        double dPow;
        kw4 kw4Var = (kw4) this.o;
        kw4Var.a(d);
        kw4 kw4Var2 = (kw4) this.s0;
        m56 m56Var = (m56) this.b;
        kw4 kw4Var3 = (kw4) this.X;
        kw4 kw4Var4 = (kw4) this.Y;
        kw4 kw4Var5 = (kw4) this.Z;
        if (z) {
            kw4Var5.a(d3);
            m56Var.invoke("EMAs: rtt=" + kw4Var.d + " bitrateE=" + kw4Var5.d + " bitrateR=" + kw4Var2.d);
        } else {
            kw4Var4.a(d2);
            kw4Var3.a(d2);
            m56Var.invoke("EMAs: rtt=" + kw4Var.d + " lossFast=" + kw4Var4.d + " lossSlow=" + kw4Var3.d);
        }
        double d4 = kw4Var.d;
        rx0 rx0Var = (rx0) this.a;
        double d5 = rx0Var.n;
        double dPow2 = 0.0d;
        double d6 = 1.0d;
        if (d5 <= 0.0d || d4 <= d5) {
            int iF = tu0.F((d4 - rx0Var.e) / rx0Var.h);
            if (iF < 0) {
                iF = 0;
            }
            dPow = Math.pow(1.0d - rx0Var.i, iF);
        } else {
            dPow = 0.0d;
        }
        if (!z) {
            double d7 = kw4Var3.d;
            double d8 = kw4Var4.d;
            double d9 = rx0Var.o;
            if (d9 <= 0.0d || d8 <= d9) {
                double d10 = rx0Var.p;
                if (d10 <= 0.0d || d7 <= d10) {
                    if (rx0Var.q) {
                        dPow2 = Math.pow(1.0d - rx0Var.t, tu0.F((d7 - rx0Var.r) / rx0Var.s) >= 0 ? r9 : 0);
                    } else if (d8 > 0.0d) {
                        d6 = (1.0d - (d8 * rx0Var.l)) - (d7 * rx0Var.m);
                    }
                }
            }
            return dPow * dPow2;
        }
        if (rx0Var.u) {
            double d11 = kw4Var2.d;
            double d12 = kw4Var5.d;
            if (!Double.isInfinite(d11) && !Double.isNaN(d11) && !Double.isInfinite(d12) && !Double.isNaN(d12)) {
                double dMin = 1.0d - ((1.0d - (Math.min(d12, d11) / Math.max(d12, d11))) * rx0Var.v);
                if (dMin <= 1.0d) {
                    d6 = dMin;
                }
            }
        }
        dPow2 = d6;
        return dPow * dPow2;
    }

    public void b(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((neg) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    @Override // defpackage.poa
    public void c(double d) {
        ((kw4) this.s0).a(d);
    }

    public void d(Bundle bundle, neg negVar) {
        if (((b9b) this.a) != null) {
            negVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(negVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.Y = (xje) this.o;
        e();
    }

    public void e() {
        Activity activity = (Activity) this.Z;
        if (activity == null || ((xje) this.Y) == null || ((b9b) this.a) != null) {
            return;
        }
        try {
            int i = lz7.g;
            synchronized (lz7.class) {
                lz7.p(activity);
            }
            yig yigVarJ0 = dy7.N((Activity) this.Z).J0(new oy9((Activity) this.Z));
            if (yigVarJ0 == null) {
                return;
            }
            ((xje) this.Y).c(new b9b((a) this.X, yigVarJ0));
            ArrayList arrayList = (ArrayList) this.s0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b9b) this.a).m((rde) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    @Override // defpackage.poa
    public void reset() {
        kw4 kw4Var = (kw4) this.c;
        kw4Var.d = kw4Var.c;
        kw4 kw4Var2 = (kw4) this.o;
        kw4Var2.d = kw4Var2.c;
        kw4 kw4Var3 = (kw4) this.X;
        kw4Var3.d = kw4Var3.c;
        kw4 kw4Var4 = (kw4) this.Y;
        kw4Var4.d = kw4Var4.c;
        kw4 kw4Var5 = (kw4) this.Z;
        kw4Var5.d = kw4Var5.c;
        kw4 kw4Var6 = (kw4) this.s0;
        kw4Var6.d = kw4Var6.c;
    }

    public moa(a aVar) {
        this.o = new xje(5, this);
        this.s0 = new ArrayList();
        this.X = aVar;
    }

    public moa(Context context) {
        this.a = context;
        final int i = 0;
        this.b = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = ytb.ic_reject_video_call_15;
                        int i3 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i3, context2, kt3.b(context2, i2));
                    case 1:
                        int i4 = ytb.ic_reject_audio_call_12;
                        int i5 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i5, context3, kt3.b(context3, i4));
                    case 2:
                        int i6 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i6));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i2 = 1;
        this.c = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i3 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i3, context2, kt3.b(context2, i22));
                    case 1:
                        int i4 = ytb.ic_reject_audio_call_12;
                        int i5 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i5, context3, kt3.b(context3, i4));
                    case 2:
                        int i6 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i6));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i3 = 2;
        this.o = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i32 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i32, context2, kt3.b(context2, i22));
                    case 1:
                        int i4 = ytb.ic_reject_audio_call_12;
                        int i5 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i5, context3, kt3.b(context3, i4));
                    case 2:
                        int i6 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i6));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i4 = 3;
        this.X = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i32 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i32, context2, kt3.b(context2, i22));
                    case 1:
                        int i42 = ytb.ic_reject_audio_call_12;
                        int i5 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i5, context3, kt3.b(context3, i42));
                    case 2:
                        int i6 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i6));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i5 = 4;
        this.Y = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i32 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i32, context2, kt3.b(context2, i22));
                    case 1:
                        int i42 = ytb.ic_reject_audio_call_12;
                        int i52 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i52, context3, kt3.b(context3, i42));
                    case 2:
                        int i6 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i6));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i6 = 5;
        this.Z = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i32 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i32, context2, kt3.b(context2, i22));
                    case 1:
                        int i42 = ytb.ic_reject_audio_call_12;
                        int i52 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i52, context3, kt3.b(context3, i42));
                    case 2:
                        int i62 = ytb.ic_incoming_video_call_15;
                        int i7 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i7, context4, kt3.b(context4, i62));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
        final int i7 = 6;
        this.s0 = tu0.r(3, new k56(this) { // from class: x81
            public final /* synthetic */ moa b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i22 = ytb.ic_reject_video_call_15;
                        int i32 = wfa.R;
                        Context context2 = (Context) this.b.a;
                        return new lre(i32, context2, kt3.b(context2, i22));
                    case 1:
                        int i42 = ytb.ic_reject_audio_call_12;
                        int i52 = wfa.R;
                        Context context3 = (Context) this.b.a;
                        return new lre(i52, context3, kt3.b(context3, i42));
                    case 2:
                        int i62 = ytb.ic_incoming_video_call_15;
                        int i72 = wfa.R;
                        Context context4 = (Context) this.b.a;
                        return new lre(i72, context4, kt3.b(context4, i62));
                    case 3:
                        int i8 = ytb.ic_incoming_audio_call_13;
                        int i9 = wfa.R;
                        Context context5 = (Context) this.b.a;
                        return new lre(i9, context5, kt3.b(context5, i8));
                    case 4:
                        int i10 = ytb.ic_outgoing_video_call_15;
                        int i11 = wfa.R;
                        Context context6 = (Context) this.b.a;
                        return new lre(i11, context6, kt3.b(context6, i10));
                    case 5:
                        int i12 = ytb.ic_outgoing_audio_call_13;
                        int i13 = wfa.R;
                        Context context7 = (Context) this.b.a;
                        return new lre(i13, context7, kt3.b(context7, i12));
                    default:
                        int i14 = ytb.ic_link_16;
                        int i15 = wfa.R;
                        Context context8 = (Context) this.b.a;
                        return new lre(i15, context8, kt3.b(context8, i14));
                }
            }
        });
    }

    public moa(j92 j92Var, kke kkeVar, ede edeVar, ns3 ns3Var) {
        this.a = j92Var;
        this.b = kkeVar;
        this.c = edeVar;
        this.o = ns3Var;
    }
}
