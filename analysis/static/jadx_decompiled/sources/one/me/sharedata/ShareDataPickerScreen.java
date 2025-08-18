package one.me.sharedata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aea;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.bc8;
import defpackage.br7;
import defpackage.bvc;
import defpackage.cc8;
import defpackage.ckd;
import defpackage.cla;
import defpackage.csb;
import defpackage.dc6;
import defpackage.ds3;
import defpackage.ekd;
import defpackage.eqe;
import defpackage.fk4;
import defpackage.fkd;
import defpackage.gkd;
import defpackage.glc;
import defpackage.gta;
import defpackage.hc8;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iy2;
import defpackage.j0e;
import defpackage.je7;
import defpackage.jkd;
import defpackage.kka;
import defpackage.kkd;
import defpackage.kke;
import defpackage.kr0;
import defpackage.m5d;
import defpackage.nec;
import defpackage.nhd;
import defpackage.nkd;
import defpackage.o45;
import defpackage.o9;
import defpackage.oag;
import defpackage.od2;
import defpackage.p8a;
import defpackage.pg7;
import defpackage.q0e;
import defpackage.q33;
import defpackage.qha;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.qza;
import defpackage.r0e;
import defpackage.r8a;
import defpackage.rha;
import defpackage.rpc;
import defpackage.s5c;
import defpackage.sv8;
import defpackage.sya;
import defpackage.t03;
import defpackage.tfg;
import defpackage.tu0;
import defpackage.tz5;
import defpackage.uka;
import defpackage.uy8;
import defpackage.vc7;
import defpackage.w12;
import defpackage.w7c;
import defpackage.wjd;
import defpackage.wz4;
import defpackage.x27;
import defpackage.x3c;
import defpackage.xid;
import defpackage.xs2;
import defpackage.xx8;
import defpackage.y53;
import defpackage.yq0;
import defpackage.ys;
import defpackage.zi5;
import defpackage.zja;
import defpackage.zn5;
import defpackage.znc;
import java.io.InputStream;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.util.share.ShareData;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lckd;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "share-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ShareDataPickerScreen extends AbstractPickerScreen<ckd> {
    public static final /* synthetic */ bc7[] D0;
    public static final x27 E0;
    public znc A0;
    public final tz5 B0;
    public hc8 C0;
    public final x27 t0;
    public final q0e u0;
    public final x3c v0;
    public final AutoTransition w0;
    public final qm0 x0;
    public final je7 y0;
    public w12 z0;

    static {
        hob hobVar = new hob(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0);
        nec.a.getClass();
        D0 = new bc7[]{hobVar};
        E0 = new x27(4, new yq0(4, 3, false));
    }

    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = x27.c;
        this.u0 = r0e.a(new eqe(rha.b));
        wjd wjdVar = wjd.a;
        this.v0 = new x3c(wjdVar.getAccessor().d(q33.class), wjdVar.getAccessor().d(kke.class), wjdVar.getAccessor().d(iy2.class), w0(bundle));
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(qha.c);
        autoTransition.addTarget(p8a.c0);
        autoTransition.addTarget(qha.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        this.w0 = autoTransition;
        this.x0 = binding(new ekd(this, 0));
        this.y0 = createViewModelLazy(cc8.class, new nhd(3, new xid(1)));
        this.B0 = new tz5(this, 2);
        kr0 kr0Var = new kr0(this, new ekd(this, 1));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 12));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.t0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return new glc(new xid(2), new xx8(getArgs().getString("ref"), 1), 4);
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        znc zncVar = this.A0;
        if (zncVar == null || !zncVar.n()) {
            return super.handleBack();
        }
        ((ckd) v0().c).k.z(1);
        return true;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        csb csbVar = new csb(getContext());
        csbVar.setId(qha.c);
        csbVar.setBackgroundColor(qp4.u0.j(csbVar).a().h().a.d);
        csbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(52 * fk4.d().getDisplayMetrics().density)));
        od2.L(new zn5(((ckd) v0().c).h, new fkd(csbVar, null), 5), getViewLifecycleScope());
        return y53.M(csbVar, x0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        wjd wjdVar = wjd.a;
        return new m5d(this.v0, new xs2(wjdVar.getAccessor().d(iy2.class)), wjdVar.getAccessor().d(ds3.class), wjdVar.getAccessor().d(q33.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerChatsTabWidget(str, false, null, null, 14, null);
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.z0 = null;
        this.A0 = null;
        hc8 hc8Var = this.C0;
        if (hc8Var != null) {
            hc8Var.a();
        }
        this.C0 = null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 2;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        br7.d(t0(), E0, null);
        w12 w12Var = new w12(viewGroup.getContext());
        w12Var.setId(qha.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        w12Var.setLayoutParams(layoutParams);
        int i2 = vc7.a;
        w12Var.setTranslationY(vc7.a(w12Var.getContext()));
        br7.d(w12Var, new x27(0, new yq0(5, 1, false), 1), null);
        this.z0 = w12Var;
        this.A0 = getChildRouter(w12Var);
        viewGroup.addView(w12Var);
        od2.L(new zn5(v0().Z, new jkd(this, view, null), 5), getViewLifecycleScope());
        od2.L(new zn5(((ckd) v0().c).j, new kkd(this, null), 5), getViewLifecycleScope());
        ViewGroup viewGroupT0 = t0();
        znc zncVar = this.A0;
        w12 w12Var2 = this.z0;
        if (zncVar == null || w12Var2 == null) {
            return;
        }
        ekd ekdVar = new ekd(this, i);
        boolean z = ((gta) wjd.a.getAccessor().c(gta.class)).b && Build.VERSION.SDK_INT >= 30;
        pg7 viewLifecycleScope = getViewLifecycleScope();
        uy8 uy8Var = (uy8) ((w7c) ((ckd) v0().c).k.c).a.getValue();
        this.C0 = new hc8(zncVar, w12Var2, viewGroupT0, ekdVar, z, viewLifecycleScope, (uy8Var != null ? uy8Var.a : 0) == 2, new zja(this, 21, viewGroupT0));
        new bc8((cc8) this.y0.getValue(), x0()).a(getViewLifecycleScope());
        od2.L(new zn5(new t03((w7c) ((ckd) v0().c).k.c, 11), new gkd(this, viewGroupT0, null), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        String string = getArgs().getString("oneme:share:title", null);
        if (string == null) {
            string = context.getString(rha.c);
        }
        cla claVar = new cla(context, 6);
        claVar.setId(qha.d);
        claVar.setTransitionName(context.getString(r8a.q));
        claVar.setTitle(string);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(7, this)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() throws Throwable {
        InputStream inputStreamOpenInputStream;
        Uri uri;
        ShareData shareData = (ShareData) ay7.v(getArgs(), "share_data", ShareData.class);
        if (shareData == null) {
            Intent intent = (Intent) getArgs().getParcelable("oneme:share:data");
            ShareData shareData2 = null;
            strJ = null;
            String strJ = null;
            InputStream inputStream = null;
            shareData2 = null;
            if (intent != null) {
                wjd wjdVar = wjd.a;
                Context context = (Context) wjdVar.getAccessor().c(Context.class);
                o45 o45Var = (o45) wjdVar.getAccessor().c(o45.class);
                zi5 zi5Var = (zi5) wjdVar.getAccessor().c(zi5.class);
                if (!oag.t(intent.getAction())) {
                    if ("android.intent.action.SEND".equals(intent.getAction())) {
                        ShareData shareData3 = new ShareData();
                        int iL = tu0.l(intent);
                        shareData3.type = iL;
                        if (iL == 0) {
                            shareData3.text = tu0.o(intent);
                        } else if (iL == 1) {
                            shareData3.images = tu0.n(intent, context, o45Var, zi5Var);
                        } else if (iL == 2) {
                            shareData3.videos = tu0.n(intent, context, o45Var, zi5Var);
                        } else if (iL == 4) {
                            shareData3.files = tu0.n(intent, context, o45Var, zi5Var);
                        } else if (iL == 5) {
                            try {
                                uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                            } catch (Exception e) {
                                e = e;
                                inputStreamOpenInputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                s5c.n(inputStream);
                                throw th;
                            }
                            if (tfg.x(uri, context, o45Var)) {
                                shareData3.vcard = strJ;
                            } else {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                try {
                                    try {
                                        strJ = s5c.J(inputStreamOpenInputStream);
                                    } catch (Exception e2) {
                                        e = e2;
                                        hm9.p("tu0", "handleVcardIntent failed, e: " + e, null);
                                        s5c.n(inputStreamOpenInputStream);
                                        shareData3.vcard = strJ;
                                        if (shareData3.type != 0) {
                                            shareData3.text = tu0.o(intent);
                                        }
                                        shareData2 = shareData3;
                                        shareData = shareData2;
                                        aea aeaVar = new aea(2);
                                        wjd wjdVar2 = wjd.a;
                                        return new ckd(shareData, aeaVar, this.v0, wjdVar2.getAccessor().d(kke.class), wjdVar2.getAccessor().d(nkd.class), wjdVar2.getAccessor().d(dc6.class));
                                    }
                                    s5c.n(inputStreamOpenInputStream);
                                    shareData3.vcard = strJ;
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = inputStreamOpenInputStream;
                                    s5c.n(inputStream);
                                    throw th;
                                }
                            }
                        }
                        if (shareData3.type != 0 && intent.hasExtra("android.intent.extra.TEXT")) {
                            shareData3.text = tu0.o(intent);
                        }
                        shareData2 = shareData3;
                    } else {
                        if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                            throw new IllegalStateException("shouldn't be here");
                        }
                        shareData2 = new ShareData();
                        int iL2 = tu0.l(intent);
                        shareData2.type = iL2;
                        if (iL2 == 1) {
                            shareData2.images = tu0.m(intent, context, o45Var, zi5Var);
                        } else if (iL2 == 2) {
                            shareData2.videos = tu0.m(intent, context, o45Var, zi5Var);
                        } else if (iL2 == 4) {
                            shareData2.files = tu0.m(intent, context, o45Var, zi5Var);
                        }
                        if (shareData2.type != 0 && intent.hasExtra("android.intent.extra.TEXT")) {
                            shareData2.text = tu0.o(intent);
                        }
                    }
                }
            }
            shareData = shareData2;
        }
        aea aeaVar2 = new aea(2);
        wjd wjdVar22 = wjd.a;
        return new ckd(shareData, aeaVar2, this.v0, wjdVar22.getAccessor().d(kke.class), wjdVar22.getAccessor().d(nkd.class), wjdVar22.getAccessor().d(dc6.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return this.u0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setN0 = longArray != null ? ys.n0(longArray) : null;
        return setN0 == null ? wz4.a : setN0;
    }

    public final sv8 x0() {
        bc7 bc7Var = D0[0];
        return (sv8) this.x0.getValue();
    }
}
