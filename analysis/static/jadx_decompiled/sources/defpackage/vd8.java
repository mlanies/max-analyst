package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final class vd8 extends hdc implements v0e {
    public final c X;
    public final wv7 Y;
    public final wv7 Z;
    public final gh7 o;
    public final wv7 s0;
    public pz7 t0;
    public final o9g u0;
    public boolean v0;
    public boolean w0;
    public final List x0;
    public final rp7 y0;
    public final HashMap z0;

    public vd8(b bVar, ArrayList arrayList, rp7 rp7Var) {
        n16 n16VarS = bVar.S();
        Object obj = null;
        this.Y = new wv7(obj);
        this.Z = new wv7(obj);
        this.s0 = new wv7(obj);
        o9g o9gVar = new o9g(16, false);
        o9gVar.b = new CopyOnWriteArrayList();
        this.u0 = o9gVar;
        this.v0 = false;
        this.w0 = false;
        this.X = n16VarS;
        this.o = bVar.a;
        A(true);
        this.x0 = arrayList;
        this.y0 = rp7Var;
        this.z0 = new HashMap();
    }

    public static void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean D(long j) {
        return j >= 0 && j < ((long) this.x0.size());
    }

    public final void E() {
        wv7 wv7Var;
        wv7 wv7Var2;
        a aVar;
        View viewK0;
        if (!this.w0 || this.X.Q()) {
            return;
        }
        xs xsVar = new xs(0);
        int i = 0;
        while (true) {
            wv7Var = this.Y;
            int iH = wv7Var.h();
            wv7Var2 = this.s0;
            if (i >= iH) {
                break;
            }
            long jE = wv7Var.e(i);
            if (!D(jE)) {
                xsVar.add(Long.valueOf(jE));
                wv7Var2.g(jE);
            }
            i++;
        }
        if (!this.v0) {
            this.w0 = false;
            for (int i2 = 0; i2 < wv7Var.h(); i2++) {
                long jE2 = wv7Var.e(i2);
                if (wv7Var2.d(jE2) < 0 && ((aVar = (a) wv7Var.c(jE2)) == null || (viewK0 = aVar.k0()) == null || viewK0.getParent() == null)) {
                    xsVar.add(Long.valueOf(jE2));
                }
            }
        }
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            I(((Long) qsVar.next()).longValue());
        }
    }

    public final FrgLocalMedia F(long j) {
        WeakReference weakReference = (WeakReference) this.z0.get(Long.valueOf(j));
        if (weakReference != null) {
            return (FrgLocalMedia) weakReference.get();
        }
        return null;
    }

    public final Long G(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            wv7 wv7Var = this.s0;
            if (i2 >= wv7Var.h()) {
                return lValueOf;
            }
            if (((Integer) wv7Var.i(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(wv7Var.e(i2));
            }
            i2++;
        }
    }

    public final void H(w16 w16Var) {
        a aVar = (a) this.Y.c(w16Var.X);
        if (aVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) w16Var.a;
        View viewK0 = aVar.k0();
        if (!aVar.o0() && viewK0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zO0 = aVar.o0();
        c cVar = this.X;
        if (zO0 && viewK0 == null) {
            ((CopyOnWriteArrayList) cVar.o.c).add(new c16(new jo7(this, aVar, frameLayout)));
            return;
        }
        if (aVar.o0() && viewK0.getParent() != null) {
            if (viewK0.getParent() != frameLayout) {
                C(viewK0, frameLayout);
                return;
            }
            return;
        }
        if (aVar.o0()) {
            C(viewK0, frameLayout);
            return;
        }
        if (cVar.Q()) {
            if (cVar.J) {
                return;
            }
            this.o.a(new bc4(this, w16Var));
            return;
        }
        ((CopyOnWriteArrayList) cVar.o.c).add(new c16(new jo7(this, aVar, frameLayout)));
        o9g o9gVar = this.u0;
        o9gVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) o9gVar.b).iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
        try {
            aVar.Z0(false);
            he0 he0Var = new he0(cVar);
            he0Var.f(0, aVar, "f" + w16Var.X, 1);
            he0Var.i(aVar, fg7.o);
            he0Var.e();
            this.t0.f(false);
        } finally {
            o9g.u(arrayList);
        }
    }

    public final void I(long j) {
        ViewParent parent;
        wv7 wv7Var = this.Y;
        a aVar = (a) wv7Var.c(j);
        if (aVar == null) {
            return;
        }
        if (aVar.k0() != null && (parent = aVar.k0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zD = D(j);
        wv7 wv7Var2 = this.Z;
        if (!zD) {
            wv7Var2.g(j);
        }
        if (!aVar.o0()) {
            wv7Var.g(j);
            return;
        }
        c cVar = this.X;
        if (cVar.Q()) {
            this.w0 = true;
            return;
        }
        boolean zO0 = aVar.o0();
        o9g o9gVar = this.u0;
        if (zO0 && D(j)) {
            o9gVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) o9gVar.b).iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
            x06 x06VarB0 = cVar.b0(aVar);
            o9g.u(arrayList);
            wv7Var2.f(j, x06VarB0);
        }
        o9gVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) o9gVar.b).iterator();
        if (it2.hasNext()) {
            au1.r(it2.next());
            throw null;
        }
        try {
            he0 he0Var = new he0(cVar);
            he0Var.h(aVar);
            he0Var.e();
            wv7Var.g(j);
        } finally {
            o9g.u(arrayList2);
        }
    }

    @Override // defpackage.v0e
    public final Parcelable a() {
        wv7 wv7Var = this.Y;
        int iH = wv7Var.h();
        wv7 wv7Var2 = this.Z;
        Bundle bundle = new Bundle(wv7Var2.h() + iH);
        for (int i = 0; i < wv7Var.h(); i++) {
            long jE = wv7Var.e(i);
            a aVar = (a) wv7Var.c(jE);
            if (aVar != null && aVar.o0()) {
                this.X.W(bundle, ey8.h(jE, "f#"), aVar);
            }
        }
        for (int i2 = 0; i2 < wv7Var2.h(); i2++) {
            long jE2 = wv7Var2.e(i2);
            if (D(jE2)) {
                bundle.putParcelable(ey8.h(jE2, "s#"), (Parcelable) wv7Var2.c(jE2));
            }
        }
        return bundle;
    }

    @Override // defpackage.v0e
    public final void c(Parcelable parcelable) throws NumberFormatException {
        String next;
        wv7 wv7Var = this.Z;
        if (wv7Var.h() == 0) {
            wv7 wv7Var2 = this.Y;
            if (wv7Var2.h() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(vd8.class.getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (wv7Var2.h() == 0) {
                            return;
                        }
                        this.w0 = true;
                        this.v0 = true;
                        E();
                        Handler handler = new Handler(Looper.getMainLooper());
                        re reVar = new re(25, this);
                        this.o.a(new bc4(handler, 2, reVar));
                        handler.postDelayed(reVar, WorkRequest.MIN_BACKOFF_MILLIS);
                        return;
                    }
                    next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        wv7Var2.f(Long.parseLong(next.substring(2)), this.X.H(next, bundle));
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            break;
                        }
                        long j = Long.parseLong(next.substring(2));
                        x06 x06Var = (x06) bundle.getParcelable(next);
                        if (D(j)) {
                            wv7Var.f(j, x06Var);
                        }
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.x0.size();
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        return i;
    }

    @Override // defpackage.hdc
    public final void q(RecyclerView recyclerView) {
        c54.k(this.t0 == null);
        pz7 pz7Var = new pz7();
        pz7Var.f = this;
        pz7Var.a = -1L;
        this.t0 = pz7Var;
        ViewPager2 viewPager2E = pz7.e(recyclerView);
        pz7Var.e = viewPager2E;
        lh0 lh0Var = new lh0(7, pz7Var);
        pz7Var.b = lh0Var;
        viewPager2E.b(lh0Var);
        pz4 pz4Var = new pz4(2, pz7Var);
        pz7Var.c = pz4Var;
        z(pz4Var);
        fdc fdcVar = new fdc(5, pz7Var);
        pz7Var.d = fdcVar;
        this.o.a(fdcVar);
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        a frgLocalPhoto;
        Bundle bundle;
        w16 w16Var = (w16) decVar;
        long j = w16Var.X;
        FrameLayout frameLayout = (FrameLayout) w16Var.a;
        int id = frameLayout.getId();
        Long lG = G(id);
        wv7 wv7Var = this.s0;
        if (lG != null && lG.longValue() != j) {
            I(lG.longValue());
            wv7Var.g(lG.longValue());
        }
        wv7Var.f(j, Integer.valueOf(id));
        long j2 = i;
        wv7 wv7Var2 = this.Y;
        if (wv7Var2.d(j2) < 0) {
            up7 up7Var = (up7) this.x0.get(i);
            String strA = up7Var.a();
            rp7 rp7Var = this.y0;
            String str = rp7Var.Y;
            Bundle bundle2 = null;
            boolean zE = kp.e(strA != null ? Uri.parse(strA) : null, str != null ? Uri.parse(str) : null);
            HashMap map = this.z0;
            int i2 = up7Var.a;
            long j3 = up7Var.b;
            if (i2 != 1) {
                if (i2 != 3) {
                    throw new IllegalStateException(zr6.h(i2, "media type should be known, type = "));
                }
                frgLocalPhoto = new FrgLocalVideo();
                frgLocalPhoto.X0(FrgLocalMedia.s1(up7Var, zE, rp7Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            } else if (up7Var.d()) {
                frgLocalPhoto = new FrgLocalGif();
                frgLocalPhoto.X0(FrgLocalMedia.s1(up7Var, zE, rp7Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            } else {
                frgLocalPhoto = new FrgLocalPhoto();
                frgLocalPhoto.X0(FrgLocalMedia.s1(up7Var, zE, rp7Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            }
            x06 x06Var = (x06) this.Z.c(j2);
            if (frgLocalPhoto.F0 != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (x06Var != null && (bundle = x06Var.a) != null) {
                bundle2 = bundle;
            }
            frgLocalPhoto.b = bundle2;
            wv7Var2.f(j2, frgLocalPhoto);
        }
        if (frameLayout.isAttachedToWindow()) {
            H(w16Var);
        }
        E();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = w16.F0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new w16(frameLayout);
    }

    @Override // defpackage.hdc
    public final void u(RecyclerView recyclerView) {
        pz7 pz7Var = this.t0;
        pz7Var.getClass();
        pz7.e(recyclerView).g((lh0) pz7Var.b);
        pz4 pz4Var = (pz4) pz7Var.c;
        vd8 vd8Var = (vd8) pz7Var.f;
        vd8Var.B(pz4Var);
        vd8Var.o.f((fdc) pz7Var.d);
        pz7Var.e = null;
        this.t0 = null;
    }

    @Override // defpackage.hdc
    public final /* bridge */ /* synthetic */ boolean v(dec decVar) {
        return true;
    }

    @Override // defpackage.hdc
    public final void w(dec decVar) {
        H((w16) decVar);
        E();
    }

    @Override // defpackage.hdc
    public final void y(dec decVar) {
        Long lG = G(((FrameLayout) ((w16) decVar).a).getId());
        if (lG != null) {
            I(lG.longValue());
            this.s0.g(lG.longValue());
        }
    }
}
