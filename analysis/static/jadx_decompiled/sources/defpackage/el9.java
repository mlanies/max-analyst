package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.location.TamSupportMapFragment;

/* loaded from: classes2.dex */
public final class el9 extends v2 implements dye, nse, kk9 {
    public final u8e A0;
    public TamSupportMapFragment B0;
    public AppCompatImageView C0;
    public Group D0;
    public OneMeButton E0;
    public OneMeButton F0;
    public de7 G0;
    public mj9 H0;
    public ViewStub I0;
    public il9 J0;
    public qy7 K0;
    public ny7 L0;
    public bk4 M0;
    public ValueAnimator N0;
    public ir7 O0;
    public final ida X;
    public final el3 Y;
    public final vy7 Z;
    public final hc3 o;
    public final ad s0;
    public final c t0;
    public final long u0;
    public final tg v0;
    public final m7b w0;
    public final ztc x0;
    public final ri4 y0;
    public final boolean z0;

    public el9(Context context, ViewGroup viewGroup, ida idaVar, el3 el3Var, vy7 vy7Var, ad adVar, c cVar, long j, tg tgVar, p7b p7bVar, ztc ztcVar, ri4 ri4Var, boolean z, u8e u8eVar) {
        super(context);
        this.o = new hc3();
        this.X = idaVar;
        this.Y = el3Var;
        this.Z = vy7Var;
        this.s0 = adVar;
        this.t0 = cVar;
        this.u0 = j;
        this.v0 = tgVar;
        this.w0 = p7bVar;
        this.x0 = ztcVar;
        this.y0 = ri4Var;
        this.z0 = z;
        this.A0 = u8eVar;
        l(viewGroup, yyb.frg_location_map);
    }

    public final void A(final long j, final boolean z) {
        q1a q1aVar;
        final qy7 qy7Var = this.K0;
        if (qy7Var == null) {
            return;
        }
        final long j2 = qy7Var.q;
        qy7Var.q = j;
        cqc.b(qy7Var.r);
        vy7 vy7Var = qy7Var.e;
        Context context = (Context) this.b;
        synchronized (vy7Var) {
            q1aVar = new q1a(1, new d74(vy7Var, 22, context));
        }
        drd drdVarI = q1aVar.m(qy7Var.f).i(ce.a());
        iq1 iq1Var = new iq1(new qj3() { // from class: wi0
            @Override // defpackage.qj3
            public final void accept(Object obj) {
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = qy7Var.b;
                xi0 xi0Var = (xi0) linkedHashMap.get(Long.valueOf(j2));
                boolean z2 = z;
                if (xi0Var != null) {
                    y8 y8Var = xi0Var.a;
                    if (z2) {
                        y8Var.G((sn0) map.get(uy7.a));
                    } else {
                        y8Var.G((sn0) map.get(uy7.c));
                    }
                    y8Var.I();
                }
                xi0 xi0Var2 = (xi0) linkedHashMap.get(Long.valueOf(j));
                if (xi0Var2 != null) {
                    y8 y8Var2 = xi0Var2.a;
                    if (z2) {
                        y8Var2.G((sn0) map.get(uy7.b));
                    } else {
                        y8Var2.G((sn0) map.get(uy7.o));
                    }
                    y8Var2.I();
                }
            }
        }, 2, new xw0(25));
        drdVarI.k(iq1Var);
        qy7Var.r = iq1Var;
    }

    public final void B(double d, double d2, boolean z) {
        if (this.K0 == null) {
            return;
        }
        if (z) {
            double[] dArrD = D();
            if (this.D0.getVisibility() == 0 && Math.abs(dArrD[0] - d) <= 0.001d && Math.abs(dArrD[1] - d2) <= 0.001d) {
                F();
            }
        }
        qy7 qy7Var = this.K0;
        qy7Var.g.getClass();
        LatLng latLng = new LatLng(d, d2);
        try {
            sfg sfgVar = mr0.m;
            fp3.o(sfgVar, "CameraUpdateFactory is not initialized");
            Parcel parcelG0 = sfgVar.G0();
            agg.b(parcelG0, latLng);
            Parcel parcelR = sfgVar.R(parcelG0, 8);
            xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
            parcelR.recycle();
            qy7Var.e(new bkg(6, new y8(xr6VarK0)), true);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.util.List r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el9.C(java.util.List, boolean):void");
    }

    public final double[] D() {
        qy7 qy7Var = this.K0;
        if (qy7Var == null) {
            return new double[]{1.401298464324817E-45d, 1.401298464324817E-45d};
        }
        LatLng latLng = ((CameraPosition) qy7Var.d.X().b).a;
        return new double[]{latLng.a, latLng.b};
    }

    public final ny7 E() {
        boolean z;
        boolean z2;
        qy7 qy7Var = this.K0;
        if (qy7Var == null) {
            return null;
        }
        rxd rxdVar = qy7Var.d;
        CameraPosition cameraPosition = (CameraPosition) rxdVar.X().b;
        LatLng latLng = cameraPosition.a;
        double d = latLng.a;
        y7g y7gVar = (y7g) rxdVar.b;
        u5e u5eVar = y7gVar.A() != null ? new u5e(y7gVar.A()) : null;
        boolean z3 = true;
        if (u5eVar != null) {
            wmc wmcVar = (wmc) u5eVar.a;
            wmcVar.getClass();
            mgg mggVar = (mgg) wmcVar.a;
            try {
                Parcel parcelR = mggVar.R(mggVar.G0(), 9);
                int i = agg.a;
                z2 = parcelR.readInt() != 0;
                parcelR.recycle();
                try {
                    Parcel parcelR2 = mggVar.R(mggVar.G0(), 13);
                    z = parcelR2.readInt() != 0;
                    parcelR2.recycle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } else {
            z = false;
            z2 = false;
        }
        ny7 ny7Var = new ny7();
        ny7Var.a = d;
        ny7Var.b = latLng.b;
        ny7Var.c = z2;
        ny7Var.d = z;
        y7gVar.getClass();
        try {
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelR3 = eigVar.R(eigVar.G0(), 21);
            int i2 = agg.a;
            if (parcelR3.readInt() == 0) {
                z3 = false;
            }
            parcelR3.recycle();
            ny7Var.e = z3;
            ny7Var.f = rxdVar.Y();
            ny7Var.g = cameraPosition.b;
            ny7Var.h = cameraPosition.c;
            ny7Var.i = cameraPosition.o;
            return new ny7(ny7Var);
        } catch (RemoteException e3) {
            throw new RuntimeRemoteException(e3);
        }
    }

    public final void F() {
        int i = 2;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -this.M0.n);
        this.N0 = valueAnimatorOfFloat;
        tg tgVar = this.v0;
        valueAnimatorOfFloat.setInterpolator(tgVar.a.n());
        this.N0.setDuration(tgVar.a.b());
        this.N0.setRepeatMode(2);
        this.N0.setRepeatCount(1);
        this.N0.addUpdateListener(new z00(i, this));
        this.N0.start();
    }

    @Override // defpackage.nse
    public final void c() {
        View view = (View) this.c;
        if (view == null) {
            return;
        }
        fka fkaVarJ = qp4.u0.j(view);
        ((View) this.c).setBackgroundColor(fkaVarJ.b().g);
        this.C0.setImageTintList(ColorStateList.valueOf(fkaVarJ.getIcon().k));
    }

    @Override // defpackage.v2
    public final void m() {
        ViewGroup viewGroup = (ViewGroup) ((View) this.c);
        View claVar = new cla(viewGroup.getContext(), 4);
        claVar.setId(xxb.frg_location_map__toolbar);
        claVar.setLayoutParams(new ti3(-1, -2));
        ti3 ti3Var = (ti3) claVar.getLayoutParams();
        ti3Var.i = 0;
        ti3Var.t = 0;
        ti3Var.v = 0;
        claVar.setLayoutParams(ti3Var);
        viewGroup.addView(claVar);
        ((View) this.c).getContext();
        this.M0 = bk4.b();
        cla claVar2 = (cla) ((View) this.c).findViewById(xxb.frg_location_map__toolbar);
        claVar2.setTitle(jpc.V2);
        claVar2.setForm(uka.a);
        claVar2.setLeftActions(new lka(new l(14, this)));
        this.B0 = (TamSupportMapFragment) this.t0.D(xxb.frg_location_map__map);
        this.C0 = (AppCompatImageView) ((View) this.c).findViewById(xxb.frg_location_map__marker_head);
        this.D0 = (Group) ((View) this.c).findViewById(xxb.frg_location_map__marker_group);
        OneMeButton oneMeButton = (OneMeButton) ((View) this.c).findViewById(xxb.frg_location_map__current_location_fab);
        this.E0 = oneMeButton;
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        OneMeButton oneMeButton2 = this.E0;
        b7a b7aVar = b7a.a;
        oneMeButton2.setMode(b7aVar);
        OneMeButton oneMeButton3 = this.E0;
        z6a z6aVar = z6a.a;
        oneMeButton3.setAppearance(z6aVar);
        this.E0.d(Integer.valueOf(woc.q0), true);
        OneMeButton oneMeButton4 = (OneMeButton) ((View) this.c).findViewById(xxb.frg_location_map__layer_fab);
        this.F0 = oneMeButton4;
        oneMeButton4.setSize(c7aVar);
        this.F0.setMode(b7aVar);
        this.F0.setAppearance(z6aVar);
        this.F0.d(Integer.valueOf(gpc.G), true);
        final int i = 0;
        k56 k56Var = new k56(this) { // from class: hj0
            public final /* synthetic */ el9 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        el9 el9Var = this.b;
                        el9Var.s0.f("LOCATION_MAP_TYPE_NORMAL");
                        el9Var.n(new fj0(10));
                        break;
                    case 1:
                        el9 el9Var2 = this.b;
                        el9Var2.s0.f("LOCATION_MAP_TYPE_SATELLITE");
                        el9Var2.n(new fj0(9));
                        break;
                    default:
                        el9 el9Var3 = this.b;
                        el9Var3.s0.f("LOCATION_MAP_TYPE_HYBRID");
                        el9Var3.n(new fj0(1));
                        break;
                }
                return e5f.a;
            }
        };
        final int i2 = 1;
        k56 k56Var2 = new k56(this) { // from class: hj0
            public final /* synthetic */ el9 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        el9 el9Var = this.b;
                        el9Var.s0.f("LOCATION_MAP_TYPE_NORMAL");
                        el9Var.n(new fj0(10));
                        break;
                    case 1:
                        el9 el9Var2 = this.b;
                        el9Var2.s0.f("LOCATION_MAP_TYPE_SATELLITE");
                        el9Var2.n(new fj0(9));
                        break;
                    default:
                        el9 el9Var3 = this.b;
                        el9Var3.s0.f("LOCATION_MAP_TYPE_HYBRID");
                        el9Var3.n(new fj0(1));
                        break;
                }
                return e5f.a;
            }
        };
        final int i3 = 2;
        k56 k56Var3 = new k56(this) { // from class: hj0
            public final /* synthetic */ el9 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        el9 el9Var = this.b;
                        el9Var.s0.f("LOCATION_MAP_TYPE_NORMAL");
                        el9Var.n(new fj0(10));
                        break;
                    case 1:
                        el9 el9Var2 = this.b;
                        el9Var2.s0.f("LOCATION_MAP_TYPE_SATELLITE");
                        el9Var2.n(new fj0(9));
                        break;
                    default:
                        el9 el9Var3 = this.b;
                        el9Var3.s0.f("LOCATION_MAP_TYPE_HYBRID");
                        el9Var3.n(new fj0(1));
                        break;
                }
                return e5f.a;
            }
        };
        int iG = tu0.G(240 * fk4.d().getDisplayMetrics().density);
        Context context = (Context) this.b;
        de7 de7Var = new de7(context, iG);
        de7Var.d = false;
        Integer num = null;
        int i4 = 14;
        de7Var.a.a(y53.M(new st3(new eqe(jpc.v0), num, k56Var, i4), new st3(new eqe(jpc.w0), num, k56Var2, i4), new st3(new eqe(jpc.u0), num, k56Var3, i4)), new bk(7, de7Var));
        this.G0 = de7Var;
        this.H0 = new mj9(new pk9((Context) this.b, this.X, this.Y, this.w0, this.y0, (ViewStub) ((View) this.c).findViewById(xxb.frg_location_map__contact_location)), new c08(this.u0, 0), this);
        this.I0 = (ViewStub) ((View) this.c).findViewById(xxb.frg_location_map__send_location);
        this.J0 = new il9(context, this.z0);
        this.B0.n1.setListener(this);
        final int i5 = 0;
        nd7.h(this.F0, new f6(this) { // from class: ij0
            public final /* synthetic */ el9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i5) {
                    case 0:
                        el9 el9Var = this.b;
                        el9Var.G0.showAsDropDown(el9Var.F0, 0, bk4.a(12.0f), 8388693);
                        break;
                    default:
                        this.b.n(new fj0(3));
                        break;
                }
            }
        });
        final int i6 = 1;
        nd7.h(this.E0, new f6(this) { // from class: ij0
            public final /* synthetic */ el9 b;

            {
                this.b = this;
            }

            @Override // defpackage.f6
            public final void run() {
                switch (i6) {
                    case 0:
                        el9 el9Var = this.b;
                        el9Var.G0.showAsDropDown(el9Var.F0, 0, bk4.a(12.0f), 8388693);
                        break;
                    default:
                        this.b.n(new fj0(3));
                        break;
                }
            }
        });
        this.A0.getClass();
    }
}
