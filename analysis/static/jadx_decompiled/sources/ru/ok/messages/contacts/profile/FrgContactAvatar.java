package ru.ok.messages.contacts.profile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import defpackage.a14;
import defpackage.ai3;
import defpackage.av6;
import defpackage.azb;
import defpackage.cqc;
import defpackage.e2b;
import defpackage.ed3;
import defpackage.f6;
import defpackage.fn4;
import defpackage.gpc;
import defpackage.hm9;
import defpackage.hn4;
import defpackage.hv6;
import defpackage.iv6;
import defpackage.jle;
import defpackage.jpc;
import defpackage.k4a;
import defpackage.ma6;
import defpackage.mzd;
import defpackage.nd7;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.p7b;
import defpackage.q00;
import defpackage.q46;
import defpackage.q5;
import defpackage.r20;
import defpackage.r46;
import defpackage.rz6;
import defpackage.s36;
import defpackage.s3a;
import defpackage.s46;
import defpackage.ssc;
import defpackage.t5;
import defpackage.tu0;
import defpackage.u00;
import defpackage.uae;
import defpackage.wv6;
import defpackage.xw0;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.contacts.profile.FrgContactAvatarsLoader;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgContactAvatar extends FrgSlideOut {
    public ArrayList C1;
    public Long D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public long H1;
    public boolean I1;

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        s46 s46Var;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (g1() == null) {
                return true;
            }
            b0().finish();
            return true;
        }
        if (itemId == xxb.menu_avatar_photo__save_to_gallery) {
            if (g1() == null || !this.o1) {
                return true;
            }
            SaveToGalleryDialog.n1((String) nd7.r(this.C1), false).k1(this.F0, "ru.ok.messages.views.dialogs.SaveToGalleryDialog");
            return true;
        }
        if (itemId == xxb.menu_avatar_photo__share) {
            long jO = ((p7b) ((k4a) this.q1.c()).y()).a.o();
            this.G1 = jO;
            ((av6) ((y8a) ((ed3) this.p1.b)).getAccessor().c(av6.class)).a((String) nd7.r(this.C1), new r46(jO, (String) nd7.r(this.C1), new WeakReference(this), 0));
            return true;
        }
        if (itemId == xxb.menu_avatar_photo__make_main) {
            s3a s3aVarG1 = g1();
            s46Var = s3aVarG1 instanceof s46 ? (s46) s3aVarG1 : null;
            if (s46Var == null) {
                return true;
            }
            final long jLongValue = this.D1.longValue();
            String str = (String) nd7.r(this.C1);
            final ActContactAvatars actContactAvatars = (ActContactAvatars) s46Var;
            cqc.b(actContactAvatars.g1);
            final int i = 2;
            actContactAvatars.g1 = cqc.a(new t5(actContactAvatars, str, jLongValue), ((jle) ((y8a) ((ed3) actContactAvatars.K0.b)).q()).a(), new f6() { // from class: s5
                @Override // defpackage.f6
                public final void run() throws Resources.NotFoundException {
                    long j = jLongValue;
                    int i2 = 0;
                    ActContactAvatars actContactAvatars2 = actContactAvatars;
                    switch (i) {
                        case 0:
                            int i3 = ActContactAvatars.h1;
                            ((el3) ((y8a) ((ed3) actContactAvatars2.K0.b)).getAccessor().c(el3.class)).d(0L, null, null);
                            k4a k4aVar = (k4a) ((pk) ((y8a) ((ed3) actContactAvatars2.K0.b)).getAccessor().c(pk.class));
                            long jD = ome.d(k4aVar.z(), new bgc(((p7b) k4aVar.y()).a.o(), j), false, 0, 12);
                            if (actContactAvatars2.Y0 == null) {
                                actContactAvatars2.Y0 = new dx3();
                            }
                            actContactAvatars2.Y0.add(Long.valueOf(jD));
                            break;
                        case 1:
                            int i4 = ActContactAvatars.h1;
                            actContactAvatars2.getClass();
                            int i5 = jpc.r2;
                            Handler handler = a14.i;
                            a14.N(0, actContactAvatars2, actContactAvatars2.getString(i5));
                            int currentItem = actContactAvatars2.V0.getCurrentItem();
                            FrgContactAvatarsLoader frgContactAvatarsLoader = actContactAvatars2.X0;
                            Iterator it = frgContactAvatarsLoader.D1.iterator();
                            int i6 = 0;
                            while (it.hasNext()) {
                                if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                                    it.remove();
                                    int i7 = frgContactAvatarsLoader.G1 - 1;
                                    if (i6 == i7) {
                                        frgContactAvatarsLoader.G1 = i7;
                                        if (i7 <= 0) {
                                            i7 = 0;
                                        }
                                        frgContactAvatarsLoader.G1 = i7;
                                    } else {
                                        int i8 = frgContactAvatarsLoader.F1 - 1;
                                        frgContactAvatarsLoader.F1 = i8;
                                        if (i8 <= 0) {
                                            i8 = 0;
                                        }
                                        frgContactAvatarsLoader.F1 = i8;
                                    }
                                }
                                i6++;
                            }
                            if (!actContactAvatars2.X0.D1.isEmpty()) {
                                int i9 = currentItem - 1;
                                if (currentItem > 0 && actContactAvatars2.c1 == currentItem) {
                                    actContactAvatars2.c1 = i9;
                                    actContactAvatars2.W0.k = i9;
                                }
                                FrgContactAvatarsLoader frgContactAvatarsLoader2 = actContactAvatars2.X0;
                                actContactAvatars2.k0(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
                                if (currentItem > 0) {
                                    ViewPager viewPager = actContactAvatars2.V0;
                                    viewPager.J0 = false;
                                    viewPager.v(i9, 0, false, false);
                                    break;
                                }
                            } else {
                                actContactAvatars2.finish();
                                break;
                            }
                            break;
                        default:
                            int i10 = ActContactAvatars.h1;
                            actContactAvatars2.getClass();
                            int i11 = jpc.j2;
                            Handler handler2 = a14.i;
                            a14.N(0, actContactAvatars2, actContactAvatars2.getString(i11));
                            long j2 = jLongValue;
                            if (j2 != 0) {
                                if (actContactAvatars2.Z0 == null) {
                                    actContactAvatars2.Z0 = new ArrayList();
                                }
                                actContactAvatars2.Z0.add(Long.valueOf(((k4a) ((pk) ((y8a) ((ed3) actContactAvatars2.K0.b)).getAccessor().c(pk.class))).H(2, j2, null, null, null, null, null, null)));
                            }
                            while (true) {
                                ArrayList arrayList = actContactAvatars2.a1;
                                if (i2 >= arrayList.size()) {
                                    break;
                                } else if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i2)).getValue()).equals(Long.valueOf(j2))) {
                                    actContactAvatars2.c1 = i2;
                                    actContactAvatars2.W0.k = i2;
                                    FrgContactAvatarsLoader frgContactAvatarsLoader3 = actContactAvatars2.X0;
                                    actContactAvatars2.k0(frgContactAvatarsLoader3.F1 + frgContactAvatarsLoader3.G1, frgContactAvatarsLoader3.D1);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                    }
                }
            }, new xw0(13), ((jle) ((y8a) ((ed3) actContactAvatars.K0.b)).q()).b());
            return true;
        }
        if (itemId != xxb.menu_avatar_photo__delete) {
            return true;
        }
        s3a s3aVarG12 = g1();
        s46Var = s3aVarG12 instanceof s46 ? (s46) s3aVarG12 : null;
        if (s46Var == null) {
            return true;
        }
        final long jLongValue2 = this.D1.longValue();
        final ActContactAvatars actContactAvatars2 = (ActContactAvatars) s46Var;
        cqc.b(actContactAvatars2.g1);
        final int i2 = 0;
        final int i3 = 1;
        actContactAvatars2.g1 = cqc.a(new f6() { // from class: s5
            @Override // defpackage.f6
            public final void run() throws Resources.NotFoundException {
                long j = jLongValue2;
                int i22 = 0;
                ActContactAvatars actContactAvatars22 = actContactAvatars2;
                switch (i2) {
                    case 0:
                        int i32 = ActContactAvatars.h1;
                        ((el3) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(el3.class)).d(0L, null, null);
                        k4a k4aVar = (k4a) ((pk) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(pk.class));
                        long jD = ome.d(k4aVar.z(), new bgc(((p7b) k4aVar.y()).a.o(), j), false, 0, 12);
                        if (actContactAvatars22.Y0 == null) {
                            actContactAvatars22.Y0 = new dx3();
                        }
                        actContactAvatars22.Y0.add(Long.valueOf(jD));
                        break;
                    case 1:
                        int i4 = ActContactAvatars.h1;
                        actContactAvatars22.getClass();
                        int i5 = jpc.r2;
                        Handler handler = a14.i;
                        a14.N(0, actContactAvatars22, actContactAvatars22.getString(i5));
                        int currentItem = actContactAvatars22.V0.getCurrentItem();
                        FrgContactAvatarsLoader frgContactAvatarsLoader = actContactAvatars22.X0;
                        Iterator it = frgContactAvatarsLoader.D1.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                                it.remove();
                                int i7 = frgContactAvatarsLoader.G1 - 1;
                                if (i6 == i7) {
                                    frgContactAvatarsLoader.G1 = i7;
                                    if (i7 <= 0) {
                                        i7 = 0;
                                    }
                                    frgContactAvatarsLoader.G1 = i7;
                                } else {
                                    int i8 = frgContactAvatarsLoader.F1 - 1;
                                    frgContactAvatarsLoader.F1 = i8;
                                    if (i8 <= 0) {
                                        i8 = 0;
                                    }
                                    frgContactAvatarsLoader.F1 = i8;
                                }
                            }
                            i6++;
                        }
                        if (!actContactAvatars22.X0.D1.isEmpty()) {
                            int i9 = currentItem - 1;
                            if (currentItem > 0 && actContactAvatars22.c1 == currentItem) {
                                actContactAvatars22.c1 = i9;
                                actContactAvatars22.W0.k = i9;
                            }
                            FrgContactAvatarsLoader frgContactAvatarsLoader2 = actContactAvatars22.X0;
                            actContactAvatars22.k0(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
                            if (currentItem > 0) {
                                ViewPager viewPager = actContactAvatars22.V0;
                                viewPager.J0 = false;
                                viewPager.v(i9, 0, false, false);
                                break;
                            }
                        } else {
                            actContactAvatars22.finish();
                            break;
                        }
                        break;
                    default:
                        int i10 = ActContactAvatars.h1;
                        actContactAvatars22.getClass();
                        int i11 = jpc.j2;
                        Handler handler2 = a14.i;
                        a14.N(0, actContactAvatars22, actContactAvatars22.getString(i11));
                        long j2 = jLongValue2;
                        if (j2 != 0) {
                            if (actContactAvatars22.Z0 == null) {
                                actContactAvatars22.Z0 = new ArrayList();
                            }
                            actContactAvatars22.Z0.add(Long.valueOf(((k4a) ((pk) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(pk.class))).H(2, j2, null, null, null, null, null, null)));
                        }
                        while (true) {
                            ArrayList arrayList = actContactAvatars22.a1;
                            if (i22 >= arrayList.size()) {
                                break;
                            } else if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i22)).getValue()).equals(Long.valueOf(j2))) {
                                actContactAvatars22.c1 = i22;
                                actContactAvatars22.W0.k = i22;
                                FrgContactAvatarsLoader frgContactAvatarsLoader3 = actContactAvatars22.X0;
                                actContactAvatars22.k0(frgContactAvatarsLoader3.F1 + frgContactAvatarsLoader3.G1, frgContactAvatarsLoader3.D1);
                                break;
                            } else {
                                i22++;
                            }
                        }
                }
            }
        }, ((jle) ((y8a) ((ed3) actContactAvatars2.K0.b)).q()).a(), new f6() { // from class: s5
            @Override // defpackage.f6
            public final void run() throws Resources.NotFoundException {
                long j = jLongValue2;
                int i22 = 0;
                ActContactAvatars actContactAvatars22 = actContactAvatars2;
                switch (i3) {
                    case 0:
                        int i32 = ActContactAvatars.h1;
                        ((el3) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(el3.class)).d(0L, null, null);
                        k4a k4aVar = (k4a) ((pk) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(pk.class));
                        long jD = ome.d(k4aVar.z(), new bgc(((p7b) k4aVar.y()).a.o(), j), false, 0, 12);
                        if (actContactAvatars22.Y0 == null) {
                            actContactAvatars22.Y0 = new dx3();
                        }
                        actContactAvatars22.Y0.add(Long.valueOf(jD));
                        break;
                    case 1:
                        int i4 = ActContactAvatars.h1;
                        actContactAvatars22.getClass();
                        int i5 = jpc.r2;
                        Handler handler = a14.i;
                        a14.N(0, actContactAvatars22, actContactAvatars22.getString(i5));
                        int currentItem = actContactAvatars22.V0.getCurrentItem();
                        FrgContactAvatarsLoader frgContactAvatarsLoader = actContactAvatars22.X0;
                        Iterator it = frgContactAvatarsLoader.D1.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                                it.remove();
                                int i7 = frgContactAvatarsLoader.G1 - 1;
                                if (i6 == i7) {
                                    frgContactAvatarsLoader.G1 = i7;
                                    if (i7 <= 0) {
                                        i7 = 0;
                                    }
                                    frgContactAvatarsLoader.G1 = i7;
                                } else {
                                    int i8 = frgContactAvatarsLoader.F1 - 1;
                                    frgContactAvatarsLoader.F1 = i8;
                                    if (i8 <= 0) {
                                        i8 = 0;
                                    }
                                    frgContactAvatarsLoader.F1 = i8;
                                }
                            }
                            i6++;
                        }
                        if (!actContactAvatars22.X0.D1.isEmpty()) {
                            int i9 = currentItem - 1;
                            if (currentItem > 0 && actContactAvatars22.c1 == currentItem) {
                                actContactAvatars22.c1 = i9;
                                actContactAvatars22.W0.k = i9;
                            }
                            FrgContactAvatarsLoader frgContactAvatarsLoader2 = actContactAvatars22.X0;
                            actContactAvatars22.k0(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
                            if (currentItem > 0) {
                                ViewPager viewPager = actContactAvatars22.V0;
                                viewPager.J0 = false;
                                viewPager.v(i9, 0, false, false);
                                break;
                            }
                        } else {
                            actContactAvatars22.finish();
                            break;
                        }
                        break;
                    default:
                        int i10 = ActContactAvatars.h1;
                        actContactAvatars22.getClass();
                        int i11 = jpc.j2;
                        Handler handler2 = a14.i;
                        a14.N(0, actContactAvatars22, actContactAvatars22.getString(i11));
                        long j2 = jLongValue2;
                        if (j2 != 0) {
                            if (actContactAvatars22.Z0 == null) {
                                actContactAvatars22.Z0 = new ArrayList();
                            }
                            actContactAvatars22.Z0.add(Long.valueOf(((k4a) ((pk) ((y8a) ((ed3) actContactAvatars22.K0.b)).getAccessor().c(pk.class))).H(2, j2, null, null, null, null, null, null)));
                        }
                        while (true) {
                            ArrayList arrayList = actContactAvatars22.a1;
                            if (i22 >= arrayList.size()) {
                                break;
                            } else if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i22)).getValue()).equals(Long.valueOf(j2))) {
                                actContactAvatars22.c1 = i22;
                                actContactAvatars22.W0.k = i22;
                                FrgContactAvatarsLoader frgContactAvatarsLoader3 = actContactAvatars22.X0;
                                actContactAvatars22.k0(frgContactAvatarsLoader3.F1 + frgContactAvatarsLoader3.G1, frgContactAvatarsLoader3.D1);
                                break;
                            } else {
                                i22++;
                            }
                        }
                }
            }
        }, new xw0(12), ((jle) ((y8a) ((ed3) actContactAvatars2.K0.b)).q()).b());
        return true;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.H1);
        bundle.putBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED", this.I1);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return null;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, ru.ok.messages.views.fragments.base.FrgBase
    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(q5Var instanceof s46)) {
            throw new RuntimeException("Activity used with FrgContactAvatar must implement FrgContactAvatar.Listener interface");
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        long j = this.G1;
        long j2 = fn4Var.a;
        HashSet hashSet = this.s1;
        String str = fn4Var.c;
        if (j == j2) {
            if (!this.o1) {
                tu0.A(hashSet, fn4Var, true);
                return;
            } else {
                hm9.d0(b0(), new File(str), ((y8a) ((ed3) this.p1.b)).h());
                j1();
                return;
            }
        }
        if (this.H1 != j2 || TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.o1) {
            tu0.A(hashSet, fn4Var, true);
        } else {
            j1();
            new mzd(((y8a) ((ed3) this.p1.b)).h(), ((y8a) ((ed3) this.p1.b)).f(), ((y8a) ((ed3) this.p1.b)).n().b).a(this, str);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        this.C1 = this.Z.getStringArrayList("ru.ok.tamtam.extra.AVATAR_URL");
        this.D1 = Long.valueOf(this.Z.getLong("ru.ok.tamtam.extra.AVATAR_ID"));
        this.E1 = this.Z.getBoolean("ru.ok.tamtam.extra.DELETE_OPTION");
        this.F1 = this.Z.getBoolean("ru.ok.tamtam.extra.MAKE_MAIN_OPTION");
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID");
            this.H1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
            this.I1 = bundle.getBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED");
        }
    }

    @Override // androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        ActContactAvatars actContactAvatars;
        int i;
        AbstractMap.SimpleEntry simpleEntry;
        long jLongValue = this.D1.longValue();
        s3a s3aVarG1 = g1();
        s46 s46Var = s3aVarG1 instanceof s46 ? (s46) s3aVarG1 : null;
        long jLongValue2 = -1;
        if (s46Var != null && (i = (actContactAvatars = (ActContactAvatars) s46Var).d1) >= 0) {
            ArrayList arrayList = actContactAvatars.a1;
            if (i < arrayList.size() && (simpleEntry = (AbstractMap.SimpleEntry) arrayList.get(actContactAvatars.d1)) != null && simpleEntry.getValue() != null) {
                jLongValue2 = ((Long) simpleEntry.getValue()).longValue();
            }
        }
        if (jLongValue == jLongValue2) {
            menu.clear();
            menuInflater.inflate(azb.menu_avatar_photo, menu);
            s3a s3aVarB0 = b0();
            ai3 ai3VarA = s3aVarB0 instanceof nwe ? ((nwe) s3aVarB0).a() : null;
            if (ai3VarA == null) {
                return;
            }
            MenuItem menuItemE = ai3VarA.e(xxb.menu_avatar_photo__make_main);
            boolean z = false;
            if (menuItemE != null) {
                menuItemE.setVisible(this.E1 && this.F1 && this.D1.longValue() != 0);
            }
            MenuItem menuItemE2 = ai3VarA.e(xxb.menu_avatar_photo__delete);
            if (menuItemE2 != null) {
                if (this.E1 && this.D1.longValue() != 0) {
                    z = true;
                }
                menuItemE2.setVisible(z);
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_profile_photo, viewGroup, false);
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(xxb.frg_profile_photo__iv_photo);
        ma6 ma6Var = new ma6(g0());
        ma6Var.l = ssc.o;
        ma6Var.j = new r20(d0(), 0);
        Context contextD0 = d0();
        int i = gpc.w;
        ma6Var.f = ngg.u(i, -1, contextD0);
        ma6Var.h = ngg.u(i, -1, d0());
        ma6Var.b = 0;
        zoomableDraweeView.setHierarchy(ma6Var.a());
        zoomableDraweeView.setZoomEnabled(true);
        zoomableDraweeView.setOnTouchListener(new q46(new GestureDetector(d0(), new q00(9, this)), 0));
        zoomableDraweeView.setListener(new u00(this, zoomableDraweeView, slideOutLayout, 11));
        e2b e2bVar = s36.a.get();
        ArrayList<String> arrayList = this.C1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            try {
                iv6 iv6VarO = s36.o();
                wv6 wv6VarB = wv6.b(str);
                iv6VarO.getClass();
                arrayList2.add(new hv6(iv6VarO, wv6VarB, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        e2bVar.g = new rz6(arrayList2, false);
        e2bVar.i = true;
        e2bVar.l = zoomableDraweeView.getController();
        zoomableDraweeView.setController(e2bVar.a());
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        s3a s3aVarB0 = b0();
        ai3 ai3VarA = s3aVarB0 instanceof nwe ? ((nwe) s3aVarB0).a() : null;
        if (ai3VarA != null) {
            ai3VarA.h();
        }
        return slideOutLayout;
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        long j = this.G1;
        long j2 = hn4Var.a;
        HashSet hashSet = this.s1;
        if (j == j2) {
            if (this.o1) {
                j1();
                a14.N(0, d0(), h0(jpc.W2));
                return;
            } else {
                tu0.A(hashSet, hn4Var, true);
                return;
            }
        }
        if (this.H1 == j2) {
            if (this.o1) {
                j1();
                a14.K(d0(), jpc.P2);
            } else {
                tu0.A(hashSet, hn4Var, false);
            }
        }
    }
}
