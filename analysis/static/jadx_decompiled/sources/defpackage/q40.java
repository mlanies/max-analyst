package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final class q40 implements dce {
    public final Object X;
    public Object Y;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object o;

    public q40(b0d b0dVar, bdb bdbVar, m7b m7bVar, u7b u7bVar, je7 je7Var, bce bceVar) {
        this.a = b0dVar;
        this.b = bdbVar;
        this.c = m7bVar;
        this.o = u7bVar;
        this.X = je7Var;
        this.Y = bceVar;
    }

    public static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int iC = gse.c(context, vsb.colorControlHighlight);
        int iB = gse.b(context, vsb.colorButtonNormal);
        int[] iArr = gse.b;
        int[] iArr2 = gse.d;
        int iG = s63.g(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, gse.c, gse.f}, new int[]{iB, iG, s63.g(iC, i), i});
    }

    public static LayerDrawable f(oic oicVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = oicVar.f(context, bvb.abc_star_black_48dp);
        Drawable drawableF2 = oicVar.f(context, bvb.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void n(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(gn.c(i, gn.b));
    }

    public static vxd o(q40 q40Var, a66 a66Var) {
        String str = "job-" + ((AtomicInteger) q40Var.Y).getAndIncrement();
        vxd vxdVarT = j47.T((sx3) q40Var.a, null, vx3.b, a66Var, 1);
        o87 o87Var = new o87(str, vxdVarT);
        ((ConcurrentHashMap) q40Var.X).put(str, vxdVarT);
        ((kld) q40Var.o).g(o87Var);
        ((a66) q40Var.b).invoke((String) q40Var.c, "Adding for queue job=".concat(str));
        return vxdVarT;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.p87
            if (r0 == 0) goto L13
            r0 = r6
            p87 r0 = (defpackage.p87) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            p87 r0 = new p87
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r5 = r0.X
            java.util.concurrent.ConcurrentHashMap r2 = r0.o
            defpackage.od2.a0(r6)
            goto L77
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.X
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            int r2 = r6.size()
            java.lang.String r4 = "Cancelling all jobs in queue="
            java.lang.String r2 = defpackage.zr6.h(r2, r4)
            java.lang.Object r4 = r5.b
            a66 r4 = (defpackage.a66) r4
            java.lang.Object r5 = r5.c
            java.lang.String r5 = (java.lang.String) r5
            r4.invoke(r5, r2)
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L57:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            x77 r2 = (defpackage.x77) r2
            r4 = 0
            r2.cancel(r4)
            goto L57
        L6e:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r2 = r6
        L77:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L96
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            x77 r6 = (defpackage.x77) r6
            r0.o = r2
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L77
            return r1
        L96:
            r2.clear()
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.dce
    public List c() {
        return l6d.i0(l6d.Z(new r1f(l6d.Z(new at(2, ((bce) this.Y).a()), new zbe(this, 0)), new zbe(this, 1)), new w8c(13)));
    }

    public ArrayList e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    @Override // defpackage.dce
    public List g(final String str) {
        final int i = 0;
        qk5 qk5VarZ = l6d.Z(l6d.Z(new at(2, ((bce) this.Y).a()), new zbe(this, 3)), new m56(this) { // from class: ace
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                uj3 uj3Var = (uj3) obj;
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((b0d) this.b.a).g(uj3Var, str));
                    case 1:
                        return ((b0d) this.b.a).b(uj3Var, str);
                    default:
                        return this.b.p(uj3Var, str);
                }
            }
        });
        final int i2 = 1;
        qk5 qk5VarE0 = l6d.e0(new r1f(qk5VarZ, new m56(this) { // from class: ace
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                uj3 uj3Var = (uj3) obj;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((b0d) this.b.a).g(uj3Var, str));
                    case 1:
                        return ((b0d) this.b.a).b(uj3Var, str);
                    default:
                        return this.b.p(uj3Var, str);
                }
            }
        }), new w8c(14));
        final int i3 = 2;
        return l6d.i0(new r1f(qk5VarE0, new m56(this) { // from class: ace
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                uj3 uj3Var = (uj3) obj;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(((b0d) this.b.a).g(uj3Var, str));
                    case 1:
                        return ((b0d) this.b.a).b(uj3Var, str);
                    default:
                        return this.b.p(uj3Var, str);
                }
            }
        }));
    }

    public ArrayList h() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(e());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.X);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public ColorStateList i(Context context, int i) {
        if (i == bvb.abc_edit_text_material) {
            return z7.n(context, itb.abc_tint_edittext);
        }
        if (i == bvb.abc_switch_track_mtrl_alpha) {
            return z7.n(context, itb.abc_tint_switch_track);
        }
        if (i != bvb.abc_switch_thumb_material) {
            if (i == bvb.abc_btn_default_mtrl_shape) {
                return d(context, gse.c(context, vsb.colorButtonNormal));
            }
            if (i == bvb.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == bvb.abc_btn_colored_material) {
                return d(context, gse.c(context, vsb.colorAccent));
            }
            if (i == bvb.abc_spinner_mtrl_am_alpha || i == bvb.abc_spinner_textfield_background_material) {
                return z7.n(context, itb.abc_tint_spinner);
            }
            if (a(i, (int[]) this.b)) {
                return gse.d(context, vsb.colorControlNormal);
            }
            if (a(i, (int[]) this.X)) {
                return z7.n(context, itb.abc_tint_default);
            }
            if (a(i, (int[]) this.Y)) {
                return z7.n(context, itb.abc_tint_btn_checkable);
            }
            if (i == bvb.abc_seekbar_thumb_material) {
                return z7.n(context, itb.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = gse.d(context, vsb.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = gse.b;
            iArr2[0] = gse.b(context, vsb.colorSwitchThumbNormal);
            iArr[1] = gse.e;
            iArr2[1] = gse.c(context, vsb.colorControlActivated);
            iArr[2] = gse.f;
            iArr2[2] = gse.c(context, vsb.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = gse.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = gse.e;
            iArr2[1] = gse.c(context, vsb.colorControlActivated);
            iArr[2] = gse.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void j(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        String str = (String) this.c;
        hm9.m(str, "On audio focus change, %d", objArr);
        p40 p40Var = (p40) this.b;
        if (i == -3) {
            if (!p40Var.b() || p40Var.e() <= 0.0f) {
                return;
            }
            hm9.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            p40Var.g(0.2f);
            return;
        }
        if (i == -2) {
            if (!p40Var.b() || p40Var.e() <= 0.0f) {
                return;
            }
            hm9.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
            p40Var.pause();
            return;
        }
        if (i == -1) {
            hm9.n(str, "onAudioFocusChange: AUDIOFOCUS_LOSS");
            if (!p40Var.b() || p40Var.e() <= 0.0f) {
                return;
            }
            hm9.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop");
            p40Var.pause();
            return;
        }
        if (i != 1) {
            return;
        }
        if (!p40Var.b()) {
            hm9.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player");
            p40Var.play();
        }
        float fE = p40Var.e();
        if (fE <= 0.0f || fE >= 1.0f) {
            return;
        }
        hm9.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up");
        p40Var.g(1.0f);
    }

    public void k() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.Y;
        if (audioFocusRequest == null) {
            return;
        }
        this.Y = null;
        hm9.n((String) this.c, "Release audio focus");
        fic ficVar = (fic) this.o;
        if (ficVar.a()) {
            ((Context) this.a).unregisterReceiver((BroadcastReceiver) ficVar.getValue());
            ficVar.reset();
        }
        ((AudioManager) ((khe) this.X).getValue()).abandonAudioFocusRequest(audioFocusRequest);
    }

    @Override // defpackage.dce
    public List l(LinkedHashSet linkedHashSet) {
        return l6d.i0(new r1f(l6d.Z(new at(2, ((bce) this.Y).a()), new k5d(linkedHashSet, 4, this)), new zbe(this, 2)));
    }

    public void m(int i) {
        p40 p40Var = (p40) this.b;
        if (p40Var.e() <= 0.0f || !p40Var.b()) {
            return;
        }
        fic ficVar = (fic) this.o;
        boolean zA = ficVar.a();
        Context context = (Context) this.a;
        if (zA) {
            context.unregisterReceiver((BroadcastReceiver) ficVar.getValue());
            ficVar.reset();
        }
        context.registerReceiver((BroadcastReceiver) ficVar.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(p40Var).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(i).build()).build();
        this.Y = audioFocusRequestBuild;
        hm9.n((String) this.c, "Request audio focus");
        ((AudioManager) ((khe) this.X).getValue()).requestAudioFocus(audioFocusRequestBuild);
    }

    public ybe p(uj3 uj3Var, String str) {
        String strJ = uj3Var.j();
        ArrayList arrayList = new ArrayList();
        jl3 jl3VarH = uj3Var.h();
        String strA = jl3VarH != null ? jl3VarH.a() : null;
        if (strA != null) {
            arrayList.add(strA);
        }
        return ((bdb) this.b).b(uj3Var.n(), arrayList, strJ, str, uj3Var.q(((p7b) ((m7b) this.c)).a.q(), kk0.c), ((u7b) this.o).b(uj3Var.n()), ((y4d) ((je7) this.X).getValue()).a(uj3Var.n()));
    }

    public q40(Context context, p40 p40Var) {
        this.a = context;
        this.b = p40Var;
        this.c = q40.class.getName();
        final int i = 0;
        this.o = new fic(new k56(this) { // from class: o40
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new an(2, this.b);
                    default:
                        return (AudioManager) ((Context) this.b.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
        final int i2 = 1;
        this.X = new khe(new k56(this) { // from class: o40
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new an(2, this.b);
                    default:
                        return (AudioManager) ((Context) this.b.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
    }

    public q40(ContextScope contextScope, String str, ai0 ai0Var) {
        this.a = contextScope;
        this.c = str;
        this.b = ai0Var;
        this.o = lld.a(1, Integer.MAX_VALUE, 2);
        this.X = new ConcurrentHashMap();
        this.Y = new AtomicInteger(0);
        ai0Var.invoke(str, "init " + this);
    }

    public q40(q6d q6dVar) {
        this.b = new Object();
        this.c = new LinkedHashSet();
        this.o = new LinkedHashSet();
        this.X = new LinkedHashSet();
        this.Y = new nw1(this);
        this.a = q6dVar;
    }

    public q40() {
        this.a = new int[]{bvb.abc_textfield_search_default_mtrl_alpha, bvb.abc_textfield_default_mtrl_alpha, bvb.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{bvb.abc_ic_commit_search_api_mtrl_alpha, bvb.abc_seekbar_tick_mark_material, bvb.abc_ic_menu_share_mtrl_alpha, bvb.abc_ic_menu_copy_mtrl_am_alpha, bvb.abc_ic_menu_cut_mtrl_alpha, bvb.abc_ic_menu_selectall_mtrl_alpha, bvb.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{bvb.abc_textfield_activated_mtrl_alpha, bvb.abc_textfield_search_activated_mtrl_alpha, bvb.abc_cab_background_top_mtrl_alpha, bvb.abc_text_cursor_material, bvb.abc_text_select_handle_left_mtrl, bvb.abc_text_select_handle_middle_mtrl, bvb.abc_text_select_handle_right_mtrl};
        this.o = new int[]{bvb.abc_popup_background_mtrl_mult, bvb.abc_cab_background_internal_bg, bvb.abc_menu_hardkey_panel_mtrl_mult};
        this.X = new int[]{bvb.abc_tab_indicator_material, bvb.abc_textfield_search_material};
        this.Y = new int[]{bvb.abc_btn_check_material, bvb.abc_btn_radio_material, bvb.abc_btn_check_material_anim, bvb.abc_btn_radio_material_anim};
    }
}
