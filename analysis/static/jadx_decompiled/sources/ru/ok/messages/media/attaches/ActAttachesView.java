package ru.ok.messages.media.attaches;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.viewpager.widget.ViewPager;
import defpackage.a14;
import defpackage.ad;
import defpackage.ai3;
import defpackage.b;
import defpackage.bk4;
import defpackage.bq7;
import defpackage.c20;
import defpackage.c5;
import defpackage.ce;
import defpackage.cl8;
import defpackage.cu8;
import defpackage.d5;
import defpackage.dy7;
import defpackage.e5;
import defpackage.ed3;
import defpackage.es8;
import defpackage.fk4;
import defpackage.fn4;
import defpackage.g20;
import defpackage.g5;
import defpackage.go9;
import defpackage.gpc;
import defpackage.h5;
import defpackage.he0;
import defpackage.hm9;
import defpackage.i5;
import defpackage.iq1;
import defpackage.j5;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.k8g;
import defpackage.l20;
import defpackage.lj9;
import defpackage.mg;
import defpackage.mmf;
import defpackage.mpa;
import defpackage.muc;
import defpackage.n16;
import defpackage.n46;
import defpackage.nd7;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.omf;
import defpackage.oq4;
import defpackage.ql8;
import defpackage.r5;
import defpackage.re9;
import defpackage.s20;
import defpackage.s5c;
import defpackage.sh0;
import defpackage.sme;
import defpackage.ssc;
import defpackage.tg;
import defpackage.tp7;
import defpackage.tq4;
import defpackage.uae;
import defpackage.w33;
import defpackage.we8;
import defpackage.x50;
import defpackage.xe8;
import defpackage.xw0;
import defpackage.xw8;
import defpackage.xxb;
import defpackage.y7g;
import defpackage.y8a;
import defpackage.ye8;
import defpackage.yf2;
import defpackage.yyb;
import defpackage.ze8;
import defpackage.zf2;
import defpackage.zmf;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.messages.secret.widgets.TimerView;

/* loaded from: classes2.dex */
public class ActAttachesView extends r5 implements n46, yf2, nwe, xe8 {
    public static final HashSet z1 = new HashSet(Arrays.asList(g20.c, g20.o));
    public s20 W0;
    public View X0;
    public TextView Y0;
    public TextView Z0;
    public ImageButton a1;
    public ViewPager f1;
    public String g1;
    public String h1;
    public FrgChatMediaLoader i1;
    public View j1;
    public TextView k1;
    public RelativeLayout l1;
    public sh0 m1;
    public FrameLayout n1;
    public TimerView o1;
    public Chronometer p1;
    public ai3 q1;
    public int r1;
    public View s1;
    public View t1;
    public tg u1;
    public we8 v1;
    public we8 w1;
    public ad x1;
    public cl8 y1;
    public final ArrayList V0 = new ArrayList();
    public boolean b1 = false;
    public boolean c1 = false;
    public boolean d1 = false;
    public boolean e1 = false;

    @Override // defpackage.q5, androidx.fragment.app.b
    public final void U() {
        super.U();
        if (this.c1) {
            a aVarD = S().D(xxb.act_attachments_view__fl_transition);
            xw8 xw8Var = (xw8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
            k0(aVarD, xw8Var != null ? xw8Var.a : null);
        }
    }

    @Override // defpackage.q5
    public final String Z() {
        return "MEDIA_VIEWER";
    }

    @Override // defpackage.nwe
    public final ai3 a() {
        return this.q1;
    }

    @Override // defpackage.xe8
    public final we8 b() {
        if (this.v1 == null) {
            ye8 ye8VarK = ((y8a) ((ed3) this.K0.b)).k();
            getIntent().getBooleanExtra("ru.ok.tamtam.extra.CAST_ENABLED", true);
            this.v1 = ye8VarK.n(ze8.c, new x50(true, false, true));
        }
        return this.v1;
    }

    @Override // defpackage.b56
    public final void c(boolean z, boolean z2, boolean z3) {
        this.b1 = z;
        if (z) {
            g0(null);
        } else {
            b0(null);
        }
        t0(z2, z3);
    }

    @Override // defpackage.q5
    public final void c0(int i, int i2, Intent intent) {
        sh0 sh0Var = this.m1;
        if (i == sh0Var.b) {
            sh0Var.getClass();
        }
    }

    @Override // defpackage.b56
    public final void e() {
        boolean z = !this.b1;
        this.b1 = z;
        c(z, true, false);
    }

    @Override // defpackage.b56
    public final boolean f() {
        return this.b1;
    }

    @Override // defpackage.xe8
    public final we8 i() {
        if (this.w1 == null) {
            this.w1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.a, new x50(false, true, true));
        }
        return this.w1;
    }

    public final void k0(a aVar, es8 es8Var) {
        hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: start");
        if (isFinishing() || !this.P0) {
            this.c1 = true;
            return;
        }
        findViewById(xxb.act_attachments_view__fl_transition).setVisibility(8);
        if (aVar != null) {
            n16 n16VarS = S();
            n16VarS.getClass();
            he0 he0Var = new he0(n16VarS);
            he0Var.h(aVar);
            he0Var.d(false);
        }
        hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "endTransition: setPagerVisibility");
        this.f1.setVisibility(0);
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            ArrayList arrayList = frgChatMediaLoader.B1.d;
            if (arrayList.size() > 0) {
                m0(arrayList);
            } else {
                m0(Collections.singletonList(es8Var));
            }
        }
        t0(true, false);
    }

    public final long l0() {
        return getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0L);
    }

    public final void m0(List list) throws Resources.NotFoundException {
        hm9.k("ru.ok.messages.media.attaches.ActAttachesView", "onLoadInitial: count=" + list.size());
        if (this.f1.getVisibility() != 0) {
            return;
        }
        p0(list);
    }

    public final void n0(es8 es8Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.V0;
            if (i >= arrayList.size()) {
                break;
            }
            if (((es8) arrayList.get(i)).a.b == es8Var.a.b) {
                arrayList.set(i, es8Var);
                break;
            }
            i++;
        }
        r0();
    }

    public final void o0() {
        if (this.v1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.v1);
            this.v1 = null;
        }
        if (this.w1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.w1);
            this.w1 = null;
        }
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onBackPressed() {
        o0();
        super.onBackPressed();
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Toolbar toolbar;
        super.onConfigurationChanged(configuration);
        int i = this.r1;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.x1.d(i2, "ATTACHES_SCREEN_ORIENTATION_CHANGED");
        }
        this.r1 = configuration.orientation;
        this.d1 = true;
        ai3 ai3Var = this.q1;
        if (ai3Var != null && (toolbar = (Toolbar) ai3Var.b) != null) {
            y7g y7gVar = (y7g) ai3Var.a;
            if (y7gVar.y() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = fk4.a(y7gVar.y());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.l1.getLayoutParams();
        layoutParams2.height = fk4.a(this);
        this.l1.setLayoutParams(layoutParams2);
        s20 s20Var = this.W0;
        if (s20Var != null) {
            int iIndexOf = s20Var.j.indexOf(this.g1);
            if (iIndexOf != -1) {
                ViewPager viewPager = this.f1;
                viewPager.J0 = false;
                viewPager.v(iIndexOf, 0, false, false);
                r0();
            }
        }
        nd7.R(new b(2, this), 300L);
        s0();
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        FrgAttachView frgAttachVideo;
        TransitionSet transitionSetB;
        boolean z;
        int i = 0;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.v1 = b();
        this.w1 = i();
        if (bundle != null) {
            bq7 bq7Var = (bq7) this.v1;
            bq7Var.h = bundle.getFloat(bq7Var.b("MediaPlayerController.Volume"));
            bq7Var.i = bundle.getBoolean(bq7Var.b("MediaPlayerController.Looping"));
            bq7Var.j = bundle.getBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"));
            bq7 bq7Var2 = (bq7) this.w1;
            bq7Var2.h = bundle.getFloat(bq7Var2.b("MediaPlayerController.Volume"));
            bq7Var2.i = bundle.getBoolean(bq7Var2.b("MediaPlayerController.Looping"));
            bq7Var2.j = bundle.getBoolean(bq7Var2.b("MediaPlayerController.PlayWhenReady"));
        }
        this.u1 = ((y8a) ((ed3) this.K0.b)).c();
        this.x1 = ((y8a) ((ed3) this.K0.b)).b();
        this.r1 = getResources().getConfiguration().orientation;
        this.q1 = j0(yyb.act_attachments_view);
        findViewById(xxb.act_attachments_view__fl_root);
        go9 go9Var = new go9(new y7g(this), (Toolbar) findViewById(xxb.toolbar));
        go9Var.c = u();
        ai3 ai3Var = new ai3(go9Var);
        this.q1 = ai3Var;
        c5 c5Var = new c5(i, this);
        Toolbar toolbar = (Toolbar) ai3Var.b;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(c5Var);
        }
        ai3 ai3Var2 = this.q1;
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
        ai3 ai3Var3 = this.q1;
        int i4 = ((bk4) this.K0.c).a;
        Toolbar toolbar3 = (Toolbar) ai3Var3.b;
        if (toolbar3 != null) {
            WeakHashMap weakHashMap = zmf.a;
            omf.s(toolbar3, i4);
        }
        ViewPager viewPager = (ViewPager) findViewById(xxb.act_attachments_view__vp_pager);
        this.f1 = viewPager;
        viewPager.b(new i5(this, i));
        this.X0 = findViewById(xxb.act_attachments_view__rl_info);
        this.t1 = findViewById(xxb.act_attachments_view__info_separator);
        this.l1 = (RelativeLayout) this.X0.findViewById(xxb.act_attachments_view__rl_author);
        this.Y0 = (TextView) findViewById(xxb.act_attachments_view__tv_author);
        this.Z0 = (TextView) findViewById(xxb.act_attachments_view__tv_date);
        ImageButton imageButton = (ImageButton) findViewById(xxb.act_attachments_view__iv_forward);
        this.a1 = imageButton;
        nd7.h(imageButton, new e5(i, this));
        this.j1 = findViewById(xxb.act_attachments_view__fl_caption);
        this.k1 = (TextView) findViewById(xxb.act_attachments_view__tv_caption);
        this.s1 = findViewById(xxb.act_attachments_view__caption_divider);
        this.n1 = (FrameLayout) findViewById(xxb.act_attachments_view__fl_timer);
        this.o1 = (TimerView) findViewById(xxb.act_attachments_view__timer);
        this.p1 = (Chronometer) findViewById(xxb.act_attachments_view__chrono);
        this.X0.setBackgroundColor(this.y1.m);
        this.a1.setColorFilter(this.y1.w);
        this.a1.setBackground(this.y1.a());
        int i5 = this.y1.F;
        this.k1.setTextColor(i5);
        this.s1.setBackgroundColor(this.y1.K);
        this.Y0.setTextColor(i5);
        this.Z0.setTextColor(i5);
        ai3 ai3Var4 = this.q1;
        cl8 cl8Var = this.y1;
        ai3Var4.c = cl8Var;
        ngg.g(cl8Var, ((Toolbar) ai3Var4.b).getMenu(), null);
        ngg.i(cl8Var, (Toolbar) ai3Var4.b, (TextView) ai3Var4.o, (TextView) ai3Var4.X, cl8Var.F, cl8Var.M);
        f0(u().L);
        this.t1.setBackgroundColor(this.y1.K);
        View view = this.X0;
        d5 d5Var = new d5(this);
        WeakHashMap weakHashMap2 = zmf.a;
        omf.u(view, d5Var);
        mmf.c(this.X0);
        xw8 xw8Var = (xw8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.START_MESSAGE");
        es8 es8Var = xw8Var != null ? xw8Var.a : null;
        if (es8Var == null) {
            finish();
            return;
        }
        long jL0 = l0();
        boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false);
        cu8 cu8Var = es8Var.a;
        if (!booleanExtra) {
            FrgChatMediaLoader frgChatMediaLoader = (FrgChatMediaLoader) S().E("photo_video");
            this.i1 = frgChatMediaLoader;
            if (frgChatMediaLoader == null) {
                long j = cu8Var.b;
                Long lValueOf = Long.valueOf(j);
                HashSet hashSet = ql8.d;
                boolean booleanExtra2 = getIntent().getBooleanExtra("ru.ok.tamtam.extra.DESC_ORDER", false);
                hm9.m("ru.ok.messages.media.chat.FrgChatMediaLoader", "newInstance: chatId = %d, initialMessageId = %d, descOrder = %b", Long.valueOf(jL0), lValueOf, Boolean.valueOf(booleanExtra2));
                FrgChatMediaLoader frgChatMediaLoader2 = new FrgChatMediaLoader();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("ru.ok.tamtam.extra.CHAT_ID", jL0);
                bundle2.putBoolean("ru.ok.tamtam.extra.DESC_ORDER", booleanExtra2);
                bundle2.putIntegerArrayList("ru.ok.tamtam.extra.TYPES", new ArrayList<>(hashSet));
                bundle2.putLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", j);
                frgChatMediaLoader2.X0(bundle2);
                this.i1 = frgChatMediaLoader2;
                n16 n16VarS = S();
                FrgChatMediaLoader frgChatMediaLoader3 = this.i1;
                n16VarS.getClass();
                he0 he0Var = new he0(n16VarS);
                he0Var.f(0, frgChatMediaLoader3, "photo_video", 1);
                he0Var.d(false);
            }
        }
        if (bundle == null) {
            hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "onCreate: savedInstanceState == null");
            this.g1 = getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.h1 = getIntent().getStringExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID");
            if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false)) {
                k8g k8gVar = cu8Var.z0;
                l20 l20VarH = null;
                for (int i6 = 0; i6 < k8gVar.i(); i6++) {
                    if (k8gVar.h(i6).r.equals(getIntent().getStringExtra("ru.ok.tamtam.extra.START_LOCAL_ID"))) {
                        l20VarH = k8gVar.h(i6);
                    }
                }
                if (l20VarH == null) {
                    l20VarH = k8gVar.h(0);
                }
                if (l20VarH.g()) {
                    c20 c20Var = l20VarH.g;
                    if (c20Var.a()) {
                        l20VarH = c20Var.g;
                    }
                }
                boolean zN = s5c.N(l20VarH);
                boolean zF = l20VarH.f();
                if (zF || zN) {
                    Bundle bundleS1 = FrgAttachView.s1(l20VarH, es8Var, true, false, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false));
                    FrgAttachPhoto frgAttachPhoto = new FrgAttachPhoto();
                    frgAttachPhoto.X0(bundleS1);
                    frgAttachVideo = frgAttachPhoto;
                } else {
                    Bundle bundleS12 = FrgAttachView.s1(l20VarH, es8Var, true, false, false);
                    bundleS12.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", false);
                    frgAttachVideo = new FrgAttachVideo();
                    frgAttachVideo.X0(bundleS12);
                }
                frgAttachVideo.Z.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
                dy7.e(S(), xxb.act_attachments_view__fl_transition, frgAttachVideo, "ru.ok.messages.media.attaches.fragments.FrgAttachPhoto");
                this.f1.setVisibility(8);
                this.X0.setVisibility(8);
                Toolbar toolbar4 = (Toolbar) this.q1.b;
                if (toolbar4 != null) {
                    toolbar4.setVisibility(8);
                }
                Rect rect = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                ssc sscVar = ssc.o;
                ssc sscVar2 = ssc.l;
                if (zF || zN) {
                    transitionSetB = tq4.b(sscVar2, l20VarH.i() ? sscVar2 : sscVar);
                } else {
                    transitionSetB = new TransitionSet();
                    transitionSetB.addTransition(new ChangeBounds());
                }
                if (rect != null) {
                    z = true;
                    transitionSetB.addTransition(new w33(rect, true));
                } else {
                    z = true;
                }
                if (!zF || TextUtils.isEmpty(l20VarH.b.t0)) {
                    z = false;
                }
                float[] floatArrayExtra = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra != null && !z) {
                    transitionSetB.addTransition(new oq4(floatArrayExtra, oq4.o));
                }
                transitionSetB.addListener((Transition.TransitionListener) new g5(this, frgAttachVideo, es8Var));
                setEnterSharedElementCallback(new h5(rect));
                transitionSetB.setDuration(200L);
                getWindow().setSharedElementEnterTransition(transitionSetB);
                if (cu8Var.E()) {
                    sscVar = sscVar2;
                }
                TransitionSet transitionSetB2 = tq4.b(sscVar, sscVar2);
                Rect rect2 = (Rect) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_RECT");
                if (rect2 != null) {
                    transitionSetB2.addTransition(new w33(rect2, false));
                }
                float[] floatArrayExtra2 = getIntent().getFloatArrayExtra("ru.ok.tamtam.extra.EXTRA_TRANSITION_CORNERS");
                if (floatArrayExtra2 != null) {
                    transitionSetB2.addTransition(new oq4(oq4.o, floatArrayExtra2));
                }
                transitionSetB2.setDuration(200L);
                getWindow().setSharedElementReturnTransition(transitionSetB2);
            }
        } else {
            this.g1 = bundle.getString("ru.ok.tamtam.extra.START_LOCAL_ID");
            this.b1 = bundle.getBoolean("ru.ok.tamtam.extra.UI_STATE");
            this.c1 = bundle.getBoolean("ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME");
            t0(false, false);
        }
        if (this.i1 == null) {
            p0(Collections.singletonList(es8Var));
            q0(0);
            ((y8a) ((ed3) this.K0.b)).getClass();
            tp7 tp7VarM = jyc.a.m();
            long j2 = cu8Var.b;
            tp7VarM.getClass();
            tp7.b(tp7VarM, j2, false, 2).m(muc.b()).i(ce.a()).k(new iq1(new d5(this), 2, new xw0(11)));
        }
        this.m1 = new sh0(987);
        c(false, false, false);
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o0();
    }

    @uae
    public void onEvent(re9 re9Var) throws Resources.NotFoundException {
        List list;
        boolean z;
        es8 es8Var;
        Object obj;
        if (this.P0 && re9Var.b == l0() && (list = re9Var.X) != null) {
            if (this.i1 == null) {
                for (int i = 0; i < this.W0.j.size(); i++) {
                    mpa mpaVarL = this.W0.l(i);
                    if (mpaVarL != null && (obj = mpaVarL.b) != null && list.contains(Long.valueOf(((es8) obj).a.b))) {
                        a14.N(0, this, getString(jpc.z1));
                        overridePendingTransition(0, 0);
                        finish();
                        return;
                    }
                }
                return;
            }
            int currentItem = this.f1.getCurrentItem();
            Iterator it = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Long l = (Long) it.next();
                FrgChatMediaLoader frgChatMediaLoader = this.i1;
                long jLongValue = l.longValue();
                Iterator it2 = frgChatMediaLoader.B1.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        es8Var = (es8) it2.next();
                        if (es8Var.a.b == jLongValue) {
                            break;
                        }
                    } else {
                        es8Var = null;
                        break;
                    }
                }
                if (es8Var != null) {
                    if (es8Var.a.c == 0) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
                FrgChatMediaLoader frgChatMediaLoader2 = this.i1;
                long jLongValue2 = l.longValue();
                zf2 zf2Var = frgChatMediaLoader2.B1;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = zf2Var.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (((es8) arrayList.get(i2)).a.b == jLongValue2) {
                        arrayList.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                if (this.i1.B1.d.size() > 0) {
                    p0(this.i1.B1.d);
                    if (currentItem >= this.W0.j.size()) {
                        currentItem = this.W0.j.size() - 1;
                    }
                    mpa mpaVarL2 = this.W0.l(currentItem);
                    if (mpaVarL2 != null) {
                        String str = ((l20) mpaVarL2.a).r;
                        boolean z4 = !TextUtils.equals(str, this.g1);
                        this.g1 = str;
                        q0(currentItem);
                        ViewPager viewPager = this.f1;
                        viewPager.J0 = false;
                        viewPager.v(currentItem, 0, false, false);
                        z = z4;
                    } else {
                        z = false;
                    }
                } else {
                    overridePendingTransition(0, 0);
                    finish();
                }
                if (z) {
                    a14.N(0, this, getString(z3 ? jpc.i3 : jpc.z1));
                }
            }
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            frgChatMediaLoader.B1.o.remove(this);
        }
        if (this.v1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.v1);
        }
        if (this.w1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.w1);
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() throws Resources.NotFoundException {
        super.onResume();
        FrgChatMediaLoader frgChatMediaLoader = this.i1;
        if (frgChatMediaLoader != null) {
            if (!this.d1 && frgChatMediaLoader.B1.d.size() > 0 && this.i1.B1.d.size() != this.V0.size()) {
                m0(this.i1.B1.d);
            }
            this.d1 = false;
            this.i1.B1.o.add(this);
            if (this.i1.B1.k) {
                r0();
            }
        }
        s20 s20Var = this.W0;
        if (s20Var == null) {
            return;
        }
        if (s20Var.k.size() != 0) {
            s20 s20Var2 = this.W0;
            a aVar = (a) s20Var2.g.get(s20Var2.h(this.f1.getCurrentItem()));
            if (aVar instanceof FrgAttachVideo) {
                ((FrgAttachVideo) aVar).F1();
            }
        }
        if (this.v1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.v1);
        }
        if (this.w1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.w1);
        }
        c(this.b1, false, false);
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        mpa mpaVarL;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_STATE", this.b1);
        s20 s20Var = this.W0;
        bundle.putString("ru.ok.tamtam.extra.START_LOCAL_ID", (s20Var == null || s20Var.k.size() == 0 || (mpaVarL = this.W0.l(this.f1.getCurrentItem())) == null) ? null : ((l20) mpaVarL.a).r);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_FINISH_TRANSITION_ON_RESUME", this.c1);
        we8 we8Var = this.v1;
        if (we8Var != null) {
            bq7 bq7Var = (bq7) we8Var;
            bundle.putFloat(bq7Var.b("MediaPlayerController.Volume"), bq7Var.h);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.Looping"), bq7Var.i);
            bundle.putBoolean(bq7Var.b("MediaPlayerController.PlayWhenReady"), bq7Var.j);
        }
        we8 we8Var2 = this.w1;
        if (we8Var2 != null) {
            bq7 bq7Var2 = (bq7) we8Var2;
            bundle.putFloat(bq7Var2.b("MediaPlayerController.Volume"), bq7Var2.h);
            bundle.putBoolean(bq7Var2.b("MediaPlayerController.Looping"), bq7Var2.i);
            bundle.putBoolean(bq7Var2.b("MediaPlayerController.PlayWhenReady"), bq7Var2.j);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        s20 s20Var = this.W0;
        if (s20Var != null) {
            Iterator it = s20Var.o.values().iterator();
            while (it.hasNext()) {
                FrgAttachView frgAttachView = (FrgAttachView) ((WeakReference) it.next()).get();
                if (frgAttachView != null) {
                    frgAttachView.x1(z);
                }
            }
        }
    }

    public final void p0(List list) throws Resources.NotFoundException {
        if (!getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false)) {
            list = FrgChatMediaLoader.r1(list, z1);
        }
        if (this.W0 == null) {
            s20 s20Var = new s20(S(), this.V0, this, getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_WITH_LOW_RES", false), getIntent().getBooleanExtra("ru.ok.tamtam.extra.COMPAT_MODE", false));
            this.W0 = s20Var;
            String str = this.h1;
            if (str != null) {
                s20Var.q = str;
                this.h1 = null;
            }
            this.f1.setAdapter(s20Var);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.EXTRA_WITH_TRANSITION", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", false) || getIntent().getBooleanExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", false)) {
            this.W0.p = this.g1;
        }
        s20 s20Var2 = this.W0;
        s20Var2.k.clear();
        s20Var2.j.clear();
        this.W0.j(list, true);
        this.W0.d();
        s20 s20Var3 = this.W0;
        if (s20Var3 != null) {
            int iIndexOf = s20Var3.j.indexOf(this.g1);
            if (iIndexOf != -1) {
                ViewPager viewPager = this.f1;
                viewPager.J0 = false;
                viewPager.v(iIndexOf, 0, false, false);
                r0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(int r21) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.ActAttachesView.q0(int):void");
    }

    public final void r0() {
        s20 s20Var = this.W0;
        if (s20Var != null) {
            int iIndexOf = s20Var.j.indexOf(this.g1);
            if (iIndexOf != -1) {
                q0(iIndexOf);
            }
        }
    }

    public final void s0() {
        lj9 lj9Var;
        s20 s20Var = this.W0;
        if (s20Var == null) {
            return;
        }
        FrgAttachView frgAttachViewK = s20Var.k(this.g1);
        if (!(frgAttachViewK instanceof FrgAttachVideo) || (lj9Var = ((FrgAttachVideo) frgAttachViewK).N1) == null) {
            return;
        }
        View viewU1 = lj9Var.u1();
        viewU1.post(new mg(viewU1, 5));
    }

    public final void t0(boolean z, boolean z2) {
        if (this.b1) {
            this.u1.i((Toolbar) this.q1.b);
            this.u1.i(this.X0);
            this.u1.i(this.t1);
        } else {
            this.u1.g((Toolbar) this.q1.b);
            this.u1.g(this.X0);
            this.u1.g(this.t1);
        }
        boolean z3 = this.b1;
        if (this.n1.getVisibility() != 8) {
            if (z3) {
                if (z) {
                    this.n1.animate().alpha(1.0f).setListener(new j5(this, 0));
                } else {
                    this.n1.animate().cancel();
                    this.n1.setVisibility(0);
                    this.n1.setAlpha(1.0f);
                }
            } else if (z) {
                this.n1.animate().alpha(0.0f).setListener(new j5(this, 1));
            } else {
                this.n1.animate().cancel();
                this.n1.setVisibility(4);
                this.n1.setAlpha(0.0f);
            }
        }
        s20 s20Var = this.W0;
        if (s20Var == null) {
            return;
        }
        Iterator it = s20Var.o.values().iterator();
        while (it.hasNext()) {
            FrgAttachView frgAttachView = (FrgAttachView) ((WeakReference) it.next()).get();
            if (frgAttachView != null) {
                frgAttachView.C1();
            }
        }
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        if (this.y1 == null) {
            this.y1 = cl8.e0;
        }
        return this.y1;
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        mpa mpaVarL;
        s20 s20Var = this.W0;
        if (s20Var == null || !this.P0 || (mpaVarL = s20Var.l(this.f1.getCurrentItem())) == null) {
            return;
        }
        l20 l20Var = (l20) mpaVarL.a;
        if (l20Var.d != null) {
            if (l20Var.r.equals(fn4Var.o)) {
                this.Y0.setText(getString(jpc.k3));
                this.Z0.setVisibility(8);
                this.e1 = true;
            }
        }
    }
}
