package ru.ok.messages.media.mediabar;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a14;
import defpackage.a6;
import defpackage.ai3;
import defpackage.awa;
import defpackage.b56;
import defpackage.b86;
import defpackage.bk4;
import defpackage.bn0;
import defpackage.bq7;
import defpackage.c5;
import defpackage.cl8;
import defpackage.cqc;
import defpackage.dl9;
import defpackage.dpc;
import defpackage.eae;
import defpackage.ed3;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.gd7;
import defpackage.gpc;
import defpackage.hm9;
import defpackage.i20;
import defpackage.id7;
import defpackage.jp;
import defpackage.jpc;
import defpackage.ju0;
import defpackage.khe;
import defpackage.kk9;
import defpackage.kl2;
import defpackage.l4d;
import defpackage.n3;
import defpackage.n4d;
import defpackage.nd7;
import defpackage.ng4;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.nz3;
import defpackage.oag;
import defpackage.omf;
import defpackage.ov4;
import defpackage.p4d;
import defpackage.r22;
import defpackage.r48;
import defpackage.r4d;
import defpackage.r5;
import defpackage.ref;
import defpackage.rp7;
import defpackage.s22;
import defpackage.sme;
import defpackage.spa;
import defpackage.ssc;
import defpackage.t22;
import defpackage.tg;
import defpackage.tj9;
import defpackage.tpa;
import defpackage.tq4;
import defpackage.u5;
import defpackage.uj9;
import defpackage.up7;
import defpackage.v5;
import defpackage.vd8;
import defpackage.vof;
import defpackage.w33;
import defpackage.we8;
import defpackage.wmd;
import defpackage.wuc;
import defpackage.x3c;
import defpackage.x5;
import defpackage.x50;
import defpackage.xe8;
import defpackage.xp7;
import defpackage.xpf;
import defpackage.xxb;
import defpackage.y2a;
import defpackage.y38;
import defpackage.y46;
import defpackage.y5;
import defpackage.y7g;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.z5;
import defpackage.ze8;
import defpackage.zj9;
import defpackage.zl4;
import defpackage.zmf;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.messages.media.crop.ActTamCropImage;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public class ActLocalMedias extends r5 implements b56, y46, nwe, r48, View.OnSystemUiVisibilityChangeListener, gd7, n4d, l4d, tj9, xe8, y38 {
    public static final /* synthetic */ int s1 = 0;
    public String X0;
    public rp7 Y0;
    public vd8 Z0;
    public ViewPager2 c1;
    public ai3 d1;
    public View e1;
    public MediaBarPreviewLayout f1;
    public id7 g1;
    public zl4 h1;
    public zj9 i1;
    public dl9 j1;
    public we8 k1;
    public we8 l1;
    public Toast m1;
    public cl8 o1;
    public final ArrayList V0 = new ArrayList();
    public int W0 = 0;
    public boolean a1 = true;
    public boolean b1 = true;
    public boolean n1 = true;
    public n3 p1 = null;
    public final khe q1 = new khe(new x5(0, this));
    public final y5 r1 = new y5(this, 0);

    @Override // defpackage.n4d
    public final void B1(Set set) {
        t0();
    }

    @Override // defpackage.q5
    public final String Z() {
        return "LOCAL_MEDIA_VIEWER";
    }

    @Override // defpackage.nwe
    public final ai3 a() {
        return this.d1;
    }

    @Override // defpackage.xe8
    public final we8 b() {
        if (this.k1 == null) {
            this.k1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.c, new x50(true, false, false));
        }
        return this.k1;
    }

    @Override // defpackage.b56
    public final void c(boolean z, boolean z2, boolean z3) {
        this.a1 = z;
        zl4 zl4Var = this.h1;
        if (zl4Var != null && !zl4Var.h()) {
            this.h1.g();
            this.h1 = null;
        }
        if (!z) {
            v0(z3);
            ju0.v(this);
            this.h1 = nd7.R(new u5(this, 4), 100L);
        } else {
            if (this.b1) {
                v0(z3);
                return;
            }
            g0(this);
            getWindow().getDecorView().post(new u5(this, 3));
            if (eae.k0(Build.BRAND, "meizu", true)) {
                v0(z3);
            }
        }
    }

    @Override // defpackage.q5
    public final void c0(int i, int i2, Intent intent) {
        x3c x3cVar;
        x3c x3cVar2;
        ArrayList arrayList = this.V0;
        if (arrayList.isEmpty()) {
            return;
        }
        up7 up7Var = (up7) arrayList.get(this.W0);
        if (i == 1) {
            if (i2 == -1) {
                long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0L);
                long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.END_POSITION", 0L);
                String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.THUMBNAIL_URI");
                zj9 zj9Var = this.i1;
                i20 i20VarA = zj9Var.t0.a();
                float f = zj9Var.s0;
                i20VarA.b = longExtra / f;
                i20VarA.c = longExtra2 / f;
                zj9Var.t0 = new ref(i20VarA);
                zj9Var.c2();
                up7 up7Var2 = zj9Var.X;
                p4d p4dVar = zj9Var.w0;
                p4dVar.a(up7Var2, p4dVar.a.size());
                r4d r4dVarH = p4dVar.h(up7Var2);
                if (r4dVarH != null) {
                    r4dVarH.d = stringExtra;
                    Iterator it = p4dVar.g.iterator();
                    while (it.hasNext()) {
                        ((l4d) it.next()).j(r4dVarH);
                    }
                }
                if (up7Var != null) {
                    FrgLocalMedia frgLocalMediaF = this.Z0.F(up7Var.b);
                    if (frgLocalMediaF instanceof FrgLocalVideo) {
                        ((FrgLocalVideo) frgLocalMediaF).v1();
                    }
                    this.p1 = new t22(up7Var, stringExtra);
                }
            }
        } else if (i == 2) {
            if (i2 == -1) {
                Uri uri = (Uri) intent.getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI");
                nz3 nz3Var = (nz3) intent.getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE");
                if (uri != null) {
                    zj9 zj9Var2 = this.i1;
                    awa awaVar = zj9Var2.u0;
                    if (awaVar != null) {
                        x3cVar2 = new x3c(4);
                        x3cVar2.b = awaVar.a;
                        x3cVar2.c = awaVar.b;
                        x3cVar2.o = awaVar.c;
                        x3cVar2.X = awaVar.o;
                        x3cVar2.Y = awaVar.X;
                    } else {
                        x3cVar2 = new x3c(4);
                    }
                    if (awaVar == null || awaVar.X == null) {
                        x3cVar2.o = nz3Var;
                    } else {
                        x3cVar2.Y = null;
                        x3cVar2.o = null;
                    }
                    x3cVar2.c = uri;
                    if (nz3Var == null) {
                        x3cVar2.c = null;
                    }
                    zj9Var2.u0 = new awa((Uri) x3cVar2.b, (Uri) x3cVar2.c, (nz3) x3cVar2.o, (ov4) x3cVar2.X, (Uri) x3cVar2.Y);
                    zj9Var2.b2();
                    up7 up7Var3 = zj9Var2.X;
                    p4d p4dVar2 = zj9Var2.w0;
                    boolean zJ = p4dVar2.j(up7Var3);
                    boolean z = zj9Var2.A0;
                    if (!zJ && z) {
                        zj9Var2.a2();
                    }
                    if (p4dVar2.j(zj9Var2.X) && !z) {
                        zj9Var2.a2();
                    }
                    zj9Var2.d2(new uj9(zj9Var2, 4));
                    zj9Var2.d2(new uj9(zj9Var2, 3));
                    up7 up7Var4 = (up7) arrayList.get(this.W0);
                    if (up7Var4 != null) {
                        this.p1 = new r22(up7Var4, uri);
                    }
                } else {
                    hm9.q("ru.ok.messages.media.mediabar.ActLocalMedias", "crop", new HandledException("no crop result data").getMessage());
                    a14.N(1, this, getString(jpc.i));
                    finish();
                }
            }
        } else if (i == 3 && i2 == -1) {
            Uri uri2 = (Uri) intent.getParcelableExtra("photo_editor:result_uri");
            ov4 ov4Var = (ov4) intent.getParcelableExtra("photo_editor:editor_state");
            zj9 zj9Var3 = this.i1;
            awa awaVar2 = zj9Var3.u0;
            if (awaVar2 != null) {
                x3cVar = new x3c(4);
                x3cVar.b = awaVar2.a;
                x3cVar.c = awaVar2.b;
                x3cVar.o = awaVar2.c;
                x3cVar.X = awaVar2.o;
                x3cVar.Y = awaVar2.X;
            } else {
                x3cVar = new x3c(4);
            }
            x3cVar.Y = uri2;
            x3cVar.X = ov4Var;
            zj9Var3.u0 = new awa((Uri) x3cVar.b, (Uri) x3cVar.c, (nz3) x3cVar.o, ov4Var, uri2);
            zj9Var3.b2();
            zj9Var3.d2(new uj9(zj9Var3, 0));
            if (up7Var != null) {
                this.p1 = new s22(up7Var, uri2);
            }
        }
        t0();
    }

    @Override // defpackage.q5
    public final void d0() {
        Intent intent = getIntent();
        if (intent == null || intent.getBooleanExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false)) {
            return;
        }
        super.d0();
    }

    @Override // defpackage.b56
    public final void e() {
        c(!this.a1, true, false);
    }

    @Override // defpackage.b56
    public final boolean f() {
        return this.a1;
    }

    @Override // defpackage.q5, android.app.Activity
    public final void finish() {
        ((y8a) ((ed3) this.K0.b)).m().f(wuc.CHAT_ATTACH_PICKER, spa.f);
        p4d p4dVar = m0().f;
        p4dVar.getClass();
        Iterator it = new ArrayList(p4dVar.a).iterator();
        while (it.hasNext()) {
            ((r4d) it.next()).e = false;
        }
        MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
        Pair<Integer, Integer> scrollPosition = mediaBarPreviewLayout != null ? mediaBarPreviewLayout.getScrollPosition() : new Pair<>(0, 0);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_POSITION", (Serializable) scrollPosition.first);
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_OFFSET", (Serializable) scrollPosition.second);
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT", this.p1);
        setResult(0, intent);
        super.finish();
    }

    @Override // defpackage.xe8
    public final we8 i() {
        if (this.l1 == null) {
            this.l1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.a, new x50(false, true, true));
        }
        return this.l1;
    }

    @Override // defpackage.l4d
    public final void j(r4d r4dVar) {
        t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.ok.messages.media.mediabar.FrgLocalMedia k0() {
        /*
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.c1
            r1 = 0
            if (r0 != 0) goto L7
        L5:
            r0 = r1
            goto L1d
        L7:
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L5
            java.util.ArrayList r2 = r4.V0
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r0 > r3) goto L5
            java.lang.Object r0 = r2.get(r0)
            up7 r0 = (defpackage.up7) r0
        L1d:
            if (r0 == 0) goto L28
            vd8 r4 = r4.Z0
            long r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r4 = r4.F(r0)
            return r4
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.k0():ru.ok.messages.media.mediabar.FrgLocalMedia");
    }

    public final void l0() {
        hm9.n("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: onStart");
        if (this.f1.getVisibility() != 0) {
            hm9.n("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: bottom visible");
            if (this.Y0.a) {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
                mediaBarPreviewLayout.V0.p();
                mediaBarPreviewLayout.setTranslationY(0.0f);
                mediaBarPreviewLayout.setVisibility(0);
            }
            r0();
        }
        if (((Toolbar) this.d1.b).getVisibility() != 0) {
            hm9.n("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: top visible");
            Toolbar toolbar = (Toolbar) this.d1.b;
            if (toolbar != null) {
                toolbar.setVisibility(0);
            }
        }
    }

    public final xp7 m0() {
        return ((y8a) ((ed3) this.K0.b)).j();
    }

    public final void n0() {
        ArrayList arrayList = this.V0;
        if (arrayList.size() == 0) {
            return;
        }
        int iMax = Math.max(this.W0, 0);
        this.W0 = iMax;
        if (iMax >= arrayList.size()) {
            this.W0 = arrayList.size() - 1;
        }
        this.i1.Z1((up7) arrayList.get(this.W0));
    }

    public final void o0() {
        int iOrdinal = ((kl2) this.q1.getValue()).ordinal();
        if (iOrdinal == 0) {
            q0(null);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            ScheduledSendPickerDialogFragment.p1("ru.ok.messages.media.mediabar.ActLocalMedias", S(), this, new v5(0, this));
            ScheduledSendPickerDialogFragment.q1("ru.ok.messages.media.mediabar.ActLocalMedias", S());
        }
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onBackPressed() {
        if (!this.Y0.u0) {
            p4d p4dVar = m0().f;
            p4dVar.a.clear();
            p4dVar.n();
            p4dVar.b.clear();
            if (((jp) p4dVar.h).g.getBoolean("app.send.media.as.collage", true)) {
                p4dVar.l = 3;
            } else {
                p4dVar.l = 1;
            }
        }
        super.onBackPressed();
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Toolbar toolbar;
        super.onConfigurationChanged(configuration);
        ai3 ai3Var = this.d1;
        if (ai3Var != null && (toolbar = (Toolbar) ai3Var.b) != null) {
            y7g y7gVar = (y7g) ai3Var.a;
            if (y7gVar.y() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = fk4.a(y7gVar.y());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        r0();
        id7 id7Var = this.g1;
        id7Var.getClass();
        int i = configuration.orientation;
        if (i != id7Var.c) {
            id7Var.c = i;
            id7Var.b.o = 0;
        }
        nd7.R(new u5(this, 0), 300L);
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.k1 = b();
        this.l1 = i();
        if (bundle != null) {
            bq7 bq7Var = (bq7) this.k1;
            bq7Var.h = bundle.getFloat(bq7Var.b("MediaPlayerController.Volume"));
            bq7Var.i = bundle.getBoolean(bq7Var.b("MediaPlayerController.Looping"));
            bq7Var.j = bundle.getBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"));
            bq7 bq7Var2 = (bq7) this.l1;
            bq7Var2.h = bundle.getFloat(bq7Var2.b("MediaPlayerController.Volume"));
            bq7Var2.i = bundle.getBoolean(bq7Var2.b("MediaPlayerController.Looping"));
            bq7Var2.j = bundle.getBoolean(bq7Var2.b("MediaPlayerController.PlayWhenReady"));
        }
        this.d1 = j0(yyb.act_local_medias);
        if (!wmd.l(this)) {
            finish();
            return;
        }
        id7 id7Var = new id7(getWindow().getDecorView(), this);
        this.g1 = id7Var;
        this.a.a(id7Var);
        this.Y0 = (rp7) getIntent().getParcelableExtra("ru.ok.tamtam.extra.OPTIONS");
        f0(u().L);
        ai3 ai3Var = this.d1;
        c5 c5Var = new c5(i, this);
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(c5Var);
        }
        ai3 ai3Var2 = this.d1;
        int i2 = gpc.k;
        int i3 = ((sme) ai3Var2.c).w;
        Toolbar toolbar2 = (Toolbar) ai3Var2.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(i2);
            Drawable navigationIcon = toolbar2.getNavigationIcon();
            if (navigationIcon != null) {
                ngg.G(navigationIcon, i3);
            }
        }
        ai3 ai3Var3 = this.d1;
        int i4 = this.o1.w;
        Drawable navigationIcon2 = ((Toolbar) ai3Var3.b).getNavigationIcon();
        if (navigationIcon2 != null) {
            ngg.G(navigationIcon2, i4);
        }
        ai3 ai3Var4 = this.d1;
        int i5 = this.o1.N;
        Toolbar toolbar3 = (Toolbar) ai3Var4.b;
        if (toolbar3 != null) {
            toolbar3.setBackgroundColor(i5);
        }
        ai3 ai3Var5 = this.d1;
        int i6 = this.o1.F;
        TextView textView = (TextView) ai3Var5.o;
        if (textView != null) {
            textView.setTextColor(i6);
        }
        ai3 ai3Var6 = this.d1;
        int i7 = ((bk4) this.K0.c).a;
        Toolbar toolbar4 = (Toolbar) ai3Var6.b;
        if (toolbar4 != null) {
            WeakHashMap weakHashMap = zmf.a;
            omf.s(toolbar4, i7);
        }
        rp7 rp7Var = this.Y0;
        this.X0 = rp7Var.X;
        if (bundle == null) {
            this.W0 = rp7Var.Z;
        } else {
            this.W0 = bundle.getInt("ru.ok.tamtam.extra.SELECTED_POS", 0);
            this.a1 = bundle.getBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", true);
        }
        ArrayList arrayList = this.V0;
        arrayList.addAll(m0().a(this.X0));
        MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) findViewById(xxb.act_local_medias__preview);
        this.f1 = mediaBarPreviewLayout;
        mediaBarPreviewLayout.setShouldApplyHighlight(tpa.f(this.X0, "SELECTED_MEDIA_ALBUM"));
        this.f1.setMessageEdit(this.Y0.b);
        this.f1.setFullScreen(true);
        this.f1.setListener(this);
        this.f1.J0.setVisibility(8);
        this.f1.setChatMode((kl2) this.q1.getValue());
        MediaBarPreviewLayout mediaBarPreviewLayout2 = this.f1;
        ((y8a) ((ed3) this.K0.b)).n().b.getClass();
        mediaBarPreviewLayout2.setAnimojisEnabled(fp3.t(3, Collections.emptySet()));
        if (!this.Y0.a) {
            this.f1.setVisibility(8);
        }
        View viewFindViewById = findViewById(xxb.act_local_medias__fl_root);
        this.j1 = new dl9(viewFindViewById.getContext(), (ViewStub) viewFindViewById.findViewById(xxb.act_local_medias__vs_toolbox), ((y8a) ((ed3) this.K0.b)).c());
        ed3 ed3Var = (ed3) this.K0.b;
        dl9 dl9Var = this.j1;
        rp7 rp7Var2 = this.Y0;
        y8a y8aVar = (y8a) ed3Var;
        this.i1 = new zj9(dl9Var, this, rp7Var2.a, rp7Var2.c, y8aVar.b(), y8aVar.j().f, y8aVar.h(), new bn0(this, 1), y8aVar.g(), y8aVar.n().c.q());
        this.e1 = findViewById(xxb.act_local_medias__vs_toolbox);
        t0();
        n0();
        this.c1 = (ViewPager2) findViewById(xxb.act_local_medias__view_pager);
        this.Z0 = new vd8(this, arrayList, this.Y0);
        this.c1.b(this.r1);
        this.c1.setOffscreenPageLimit(2);
        this.c1.setAdapter(this.Z0);
        if (oag.d(this.X0, "SELECTED_MEDIA_ALBUM")) {
            this.c1.b(new y5(this, 1));
            r4d r4dVarI = m0().f.i(this.W0);
            if (r4dVarI != null) {
                r4dVarI.e = true;
            }
        }
        this.c1.e(this.W0, false);
        u0(this.W0);
        t0();
        MediaBarPreviewLayout mediaBarPreviewLayout3 = this.f1;
        rp7 rp7Var3 = this.Y0;
        int i8 = rp7Var3.v0;
        RecyclerView recyclerView = mediaBarPreviewLayout3.K0;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).n1(i8, rp7Var3.w0);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.WITH_TRANSITION", false)) {
            Toolbar toolbar5 = (Toolbar) this.d1.b;
            if (toolbar5 != null) {
                toolbar5.setVisibility(4);
            }
            ssc sscVar = ssc.l;
            ssc sscVar2 = ssc.o;
            TransitionSet transitionSetB = tq4.b(sscVar, sscVar2);
            Rect rect = this.Y0.s0;
            if (rect != null) {
                transitionSetB.addTransition(new w33(rect, true));
            }
            transitionSetB.addTransition(new tq4(sscVar, sscVar2));
            setEnterSharedElementCallback(new z5(this, rect));
            transitionSetB.addListener((Transition.TransitionListener) new a6(0, this));
            transitionSetB.setDuration(((y8a) ((ed3) this.K0.b)).c().a.b());
            getWindow().setSharedElementEnterTransition(transitionSetB);
            postponeEnterTransition();
            ViewPager2 viewPager2 = this.c1;
            u5 u5Var = new u5(this, 1);
            ViewTreeObserver viewTreeObserver = viewPager2.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new xpf(viewTreeObserver, u5Var));
            TransitionSet transitionSetB2 = tq4.b(sscVar2, sscVar);
            if (rect != null) {
                transitionSetB2.addTransition(new w33(rect, false));
            }
            transitionSetB2.setDuration(((y8a) ((ed3) this.K0.b)).c().a.b());
            getWindow().setSharedElementReturnTransition(transitionSetB2);
        } else {
            l0();
        }
        g0(null);
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.l1);
        }
        ViewPager2 viewPager2 = this.c1;
        if (viewPager2 != null) {
            viewPager2.g(this.r1);
        }
        Toast toast = this.m1;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    @defpackage.uae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(defpackage.yp7 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.b
            java.lang.String r1 = r9.X0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb4
            boolean r0 = r9.P0
            r1 = 1
            if (r0 != 0) goto L15
            java.util.HashSet r9 = r9.Q0
            defpackage.tu0.A(r9, r10, r1)
            return
        L15:
            xp7 r10 = r9.m0()
            java.lang.String r0 = r9.X0
            java.util.List r10 = r10.a(r0)
            int r0 = r10.size()
            if (r0 != 0) goto L29
            r9.finish()
            return
        L29:
            java.util.ArrayList r0 = r9.V0
            int r2 = r0.size()
            int r3 = r10.size()
            if (r3 != r2) goto L36
            return
        L36:
            r9.t0()
            int r2 = r9.W0
            int r3 = r0.size()
            if (r2 < r3) goto L43
            goto Lb4
        L43:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r0.clear()
            r0.addAll(r10)
            vd8 r3 = new vd8
            rp7 r4 = r9.Y0
            r3.<init>(r9, r0, r4)
            r9.Z0 = r3
            androidx.viewpager2.widget.ViewPager2 r0 = r9.c1
            r0.setAdapter(r3)
            int r0 = r9.W0
            int r3 = r10.size()
            if (r0 < r3) goto L6a
            int r10 = r10.size()
            int r10 = r10 - r1
            goto La5
        L6a:
            int r3 = r2.size()
            int r3 = r3 + r1
            int r4 = r10.size()
            if (r3 != r4) goto L78
            int r10 = r0 + 1
            goto La5
        L78:
            java.lang.Object r0 = defpackage.x53.j0(r0, r2)
            up7 r0 = (defpackage.up7) r0
            r1 = 0
            if (r0 != 0) goto L83
        L81:
            r10 = r1
            goto La5
        L83:
            java.util.Iterator r10 = r10.iterator()
            r2 = r1
        L88:
            boolean r3 = r10.hasNext()
            r4 = -1
            if (r3 == 0) goto La2
            java.lang.Object r3 = r10.next()
            up7 r3 = (defpackage.up7) r3
            long r5 = r3.b
            long r7 = r0.b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L9f
            r10 = r2
            goto La3
        L9f:
            int r2 = r2 + 1
            goto L88
        La2:
            r10 = r4
        La3:
            if (r10 == r4) goto L81
        La5:
            r9.W0 = r10
            androidx.viewpager2.widget.ViewPager2 r0 = r9.c1
            r0.setCurrentItem(r10)
            r9.n0()
            int r10 = r9.W0
            r9.u0(r10)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.onEvent(yp7):void");
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.l1);
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        up7 up7Var;
        super.onResume();
        ((y8a) ((ed3) this.K0.b)).m().f(wuc.CHAT_ATTACH_PICKER_MEDIA_VIEWER, spa.f);
        r0();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.l1);
        }
        if (!this.n1) {
            c(this.a1, false, false);
        }
        this.n1 = false;
        ArrayList arrayList = this.V0;
        if (arrayList.size() == 0 || (up7Var = (up7) arrayList.get(this.W0)) == null) {
            return;
        }
        FrgLocalMedia frgLocalMediaF = this.Z0.F(up7Var.b);
        if (frgLocalMediaF instanceof FrgLocalVideo) {
            ((FrgLocalVideo) frgLocalMediaF).v1();
        }
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.W0);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", this.a1);
        we8 we8Var = this.k1;
        if (we8Var != null) {
            bq7 bq7Var = (bq7) we8Var;
            bundle.putFloat(bq7Var.b("MediaPlayerController.Volume"), bq7Var.h);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.Looping"), bq7Var.i);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"), bq7Var.j);
        }
        we8 we8Var2 = this.l1;
        if (we8Var2 != null) {
            bq7 bq7Var2 = (bq7) we8Var2;
            bundle.putFloat(bq7Var2.b("MediaPlayerController.Volume"), bq7Var2.h);
            bundle.putBoolean(bq7Var2.b("MediaPlayerController.Looping"), bq7Var2.i);
            bundle.putBoolean(bq7Var2.b("MediaPlayerController.PlayWhenReady"), bq7Var2.j);
        }
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onStart() {
        super.onStart();
        p4d p4dVar = m0().f;
        p4dVar.c.add(this);
        p4dVar.g.add(this);
        zj9 zj9Var = this.i1;
        up7 up7Var = zj9Var.X;
        if (up7Var != null) {
            zj9Var.Z1(up7Var);
        }
        p4d p4dVar2 = zj9Var.w0;
        p4dVar2.c.add(zj9Var);
        p4dVar2.d.add(zj9Var);
        p4dVar2.f.add(zj9Var);
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onStop() {
        super.onStop();
        p4d p4dVar = m0().f;
        p4dVar.c.remove(this);
        p4dVar.g.remove(this);
        zj9 zj9Var = this.i1;
        p4d p4dVar2 = zj9Var.w0;
        p4dVar2.c.remove(zj9Var);
        p4dVar2.d.remove(zj9Var);
        p4dVar2.f.remove(zj9Var);
        cqc.b(zj9Var.C0);
        cqc.b(null);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        boolean z = i == 0 || i == 2;
        this.b1 = z;
        if (this.a1 && z) {
            this.h1 = nd7.R(new u5(this, 2), 100L);
        }
    }

    public final void p0(boolean z, boolean z2) throws Resources.NotFoundException {
        if (z) {
            ((bq7) this.k1).t(1.0f);
            if (z2) {
                int i = jpc.K2;
                Toast toast = this.m1;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toastMakeText = Toast.makeText(this, i, 0);
                this.m1 = toastMakeText;
                toastMakeText.show();
                return;
            }
            return;
        }
        ((bq7) this.k1).v();
        if (z2) {
            int i2 = jpc.I2;
            Toast toast2 = this.m1;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast toastMakeText2 = Toast.makeText(this, i2, 0);
            this.m1 = toastMakeText2;
            toastMakeText2.show();
        }
    }

    public final void q0(ng4 ng4Var) {
        ArrayList arrayList = this.V0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (m0().f.b() == 0 && !this.Y0.b && k0() != null) {
            this.i1.a2();
        }
        Intent intent = new Intent();
        intent.putExtra("act:local_medias:send_result", (Parcelable) arrayList.get(this.W0));
        intent.putExtra("act:local_medias:delayed_attrs", ng4Var);
        setResult(-1, intent);
        if (!this.Y0.a) {
            Y();
            return;
        }
        p4d p4dVar = m0().f;
        p4dVar.getClass();
        Iterator it = new ArrayList(p4dVar.a).iterator();
        while (it.hasNext()) {
            ((r4d) it.next()).e = false;
        }
        super.finish();
    }

    public final void r0() {
        MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
        if (mediaBarPreviewLayout != null) {
            if (this.Y0.a) {
                final int i = 0;
                y2a y2aVar = new y2a(this) { // from class: w5
                    public final /* synthetic */ ActLocalMedias b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.y2a
                    public final x6g P(View view, x6g x6gVar) {
                        switch (i) {
                            case 0:
                                MediaBarPreviewLayout mediaBarPreviewLayout2 = this.b.f1;
                                int iB = x6gVar.b();
                                int iC = x6gVar.c();
                                int iA = x6gVar.a();
                                View view2 = mediaBarPreviewLayout2.I0;
                                j47.V(view2, iB);
                                View view3 = mediaBarPreviewLayout2.H0;
                                j47.V(view3, iB);
                                j47.U(view2, iC);
                                j47.U(view3, iC);
                                j47.r(mediaBarPreviewLayout2, 0);
                                j47.o(mediaBarPreviewLayout2, iA);
                                break;
                            default:
                                View view4 = this.b.e1;
                                int iA2 = x6gVar.a();
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                                if (marginLayoutParams.bottomMargin != iA2) {
                                    marginLayoutParams.bottomMargin = iA2;
                                    view4.setLayoutParams(marginLayoutParams);
                                    break;
                                }
                                break;
                        }
                        return x6gVar;
                    }
                };
                WeakHashMap weakHashMap = zmf.a;
                omf.u(mediaBarPreviewLayout, y2aVar);
                this.f1.post(new u5(this, 5));
                return;
            }
            View view = this.e1;
            final int i2 = 1;
            y2a y2aVar2 = new y2a(this) { // from class: w5
                public final /* synthetic */ ActLocalMedias b;

                {
                    this.b = this;
                }

                @Override // defpackage.y2a
                public final x6g P(View view2, x6g x6gVar) {
                    switch (i2) {
                        case 0:
                            MediaBarPreviewLayout mediaBarPreviewLayout2 = this.b.f1;
                            int iB = x6gVar.b();
                            int iC = x6gVar.c();
                            int iA = x6gVar.a();
                            View view22 = mediaBarPreviewLayout2.I0;
                            j47.V(view22, iB);
                            View view3 = mediaBarPreviewLayout2.H0;
                            j47.V(view3, iB);
                            j47.U(view22, iC);
                            j47.U(view3, iC);
                            j47.r(mediaBarPreviewLayout2, 0);
                            j47.o(mediaBarPreviewLayout2, iA);
                            break;
                        default:
                            View view4 = this.b.e1;
                            int iA2 = x6gVar.a();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                            if (marginLayoutParams.bottomMargin != iA2) {
                                marginLayoutParams.bottomMargin = iA2;
                                view4.setLayoutParams(marginLayoutParams);
                                break;
                            }
                            break;
                    }
                    return x6gVar;
                }
            };
            WeakHashMap weakHashMap2 = zmf.a;
            omf.u(view, y2aVar2);
            this.f1.post(new u5(this, 6));
        }
    }

    public final void s0(Uri uri, File file, nz3 nz3Var) {
        Uri uriFromFile = Uri.fromFile(file);
        Intent intent = new Intent(this, (Class<?>) ActTamCropImage.class);
        intent.putExtra("ru.ok.tamtam.extra.SOURCE_URI", uri);
        intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uriFromFile);
        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", nz3Var);
        intent.putExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
        startActivityForResult(intent, 2);
    }

    public final void t0() {
        this.f1.A();
        r0();
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        if (this.o1 == null) {
            this.o1 = cl8.e0;
        }
        return this.o1;
    }

    public final void u0(int i) {
        b86 b86Var;
        int iB;
        ai3 ai3Var = this.d1;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i + 1);
        String string = getString(dpc.B);
        if (tpa.f(this.X0, "SELECTED_MEDIA_ALBUM")) {
            iB = this.Z0.x0.size();
        } else {
            xp7 xp7VarM0 = m0();
            String str = this.X0;
            xp7VarM0.getClass();
            iB = tpa.f(str, "SELECTED_MEDIA_ALBUM") ? xp7VarM0.f.b() : (str == null || (b86Var = (b86) xp7VarM0.g.get(str)) == null) ? 0 : b86Var.b;
        }
        ai3Var.g(String.format(locale, "%d %s %d", numValueOf, string, Integer.valueOf(iB)));
    }

    public final void v0(boolean z) {
        tg tgVarC = ((y8a) ((ed3) this.K0.b)).c();
        ai3 ai3Var = this.d1;
        boolean z2 = this.a1;
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            if (z2) {
                tgVarC.i(toolbar);
            } else {
                tgVarC.g(toolbar);
            }
        }
        if (this.a1) {
            final dl9 dl9Var = (dl9) ((kk9) this.i1.b);
            vof vofVarA = zmf.a((View) dl9Var.c);
            final int i = 0;
            Runnable runnable = new Runnable() { // from class: cl9
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((View) dl9Var.c).setVisibility(0);
                            break;
                        default:
                            dl9 dl9Var2 = dl9Var;
                            dl9Var2.s0.requestLayout();
                            dl9Var2.t0.requestLayout();
                            dl9Var2.Z.requestLayout();
                            dl9Var2.u0.requestLayout();
                            dl9Var2.w0.requestLayout();
                            break;
                    }
                }
            };
            WeakReference weakReference = vofVarA.a;
            View view = (View) weakReference.get();
            if (view != null) {
                view.animate().withStartAction(runnable);
            }
            vofVarA.a(1.0f);
            final int i2 = 1;
            Runnable runnable2 = new Runnable() { // from class: cl9
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            ((View) dl9Var.c).setVisibility(0);
                            break;
                        default:
                            dl9 dl9Var2 = dl9Var;
                            dl9Var2.s0.requestLayout();
                            dl9Var2.t0.requestLayout();
                            dl9Var2.Z.requestLayout();
                            dl9Var2.u0.requestLayout();
                            dl9Var2.w0.requestLayout();
                            break;
                    }
                }
            };
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.animate().withEndAction(runnable2);
            }
            vofVarA.c(dl9Var.o.a.b());
            View view3 = (View) weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        } else {
            dl9 dl9Var2 = (dl9) ((kk9) this.i1.b);
            dl9Var2.B((View) dl9Var2.c, false);
        }
        if (this.Y0.a) {
            if (this.a1) {
                tgVarC.i(this.f1);
            } else {
                tgVarC.g(this.f1);
            }
        }
        vd8 vd8Var = this.Z0;
        if (vd8Var != null) {
            Iterator it = vd8Var.z0.values().iterator();
            while (it.hasNext()) {
                FrgLocalMedia frgLocalMedia = (FrgLocalMedia) ((WeakReference) it.next()).get();
                if (frgLocalMedia != null) {
                    frgLocalMedia.t1();
                }
            }
        }
    }
}
