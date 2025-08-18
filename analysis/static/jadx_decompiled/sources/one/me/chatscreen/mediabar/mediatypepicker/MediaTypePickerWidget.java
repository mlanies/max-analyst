package one.me.chatscreen.mediabar.mediatypepicker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.an9;
import defpackage.bc7;
import defpackage.bm8;
import defpackage.cm8;
import defpackage.cme;
import defpackage.dm8;
import defpackage.dy7;
import defpackage.er7;
import defpackage.fg7;
import defpackage.fs;
import defpackage.hm9;
import defpackage.hob;
import defpackage.j47;
import defpackage.je7;
import defpackage.jpc;
import defpackage.k56;
import defpackage.kke;
import defpackage.kpa;
import defpackage.mm8;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.nm8;
import defpackage.o37;
import defpackage.od2;
import defpackage.oec;
import defpackage.pnf;
import defpackage.q0e;
import defpackage.qm0;
import defpackage.suc;
import defpackage.tl8;
import defpackage.to2;
import defpackage.tu0;
import defpackage.w9a;
import defpackage.wha;
import defpackage.wl8;
import defpackage.wuc;
import defpackage.xl8;
import defpackage.z7;
import defpackage.z84;
import defpackage.zl8;
import defpackage.zn5;
import defpackage.zr6;
import java.io.Serializable;
import kotlin.Metadata;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLz84;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class MediaTypePickerWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final an9 X;
    public final fs a;
    public final fs b;
    public final je7 c;
    public final qm0 o;

    static {
        hob hobVar = new hob(MediaTypePickerWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        Y = new bc7[]{hobVar, zr6.e(oecVar, MediaTypePickerWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), zr6.f(MediaTypePickerWidget.class, "root", "getRoot()Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerButtonsView;", 0, oecVar)};
    }

    public MediaTypePickerWidget(String str, long j, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("chat_id", Long.valueOf(j))));
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == 1) {
            pnf.o(m0().b.b, xl8.a);
            return;
        }
        if (i != 2) {
            return;
        }
        try {
            String str = o37.a;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            startActivityForResult(intent, 373);
            an9.g(this.X, wuc.CHAT_SYSTEM_FILE_VIEWER);
        } catch (ActivityNotFoundException unused) {
            wha whaVar = new wha(this);
            whaVar.h(z7.B(getContext(), jpc.F1));
            whaVar.i();
        }
    }

    public final dm8 m0() {
        return (dm8) this.c.getValue();
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        cme cmeVar = null;
        cmeVar = null;
        if (i != 371) {
            if (i != 373) {
                hm9.p("MediaTypePickerWidget", "Unexpected onActivityResult code " + i2, null);
                return;
            } else {
                if (intent == null || (data = intent.getData()) == null) {
                    return;
                }
                dm8 dm8VarM0 = m0();
                j47.T(dm8VarM0.a, ((w9a) ((kke) dm8VarM0.t0.getValue())).b(), null, new cm8(data, dm8VarM0, null), 2);
                return;
            }
        }
        if (i2 == -1 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
            er7 er7Var = serializableExtra instanceof er7 ? (er7) serializableExtra : null;
            if (er7Var == null) {
                er7Var = er7.Z;
            }
            cmeVar = new cme(er7Var, intent.getLongExtra("ru.ok.tamtam.extra.LIVE", 0L), intent.getLongExtra("ru.ok.tamtam.extra.ZOOM", 0L));
        }
        if (cmeVar != null) {
            bm8 bm8Var = m0().b;
            pnf.o(bm8Var.b, new zl8(cmeVar.a, cmeVar.c, cmeVar.b));
            pnf.o(bm8Var.b, wl8.a);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc7 bc7Var = Y[2];
        return (tl8) this.o.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q0e q0eVar = m0().X;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(q0eVar, getViewLifecycleOwner().Q(), fg7Var), new mm8(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().Y, getViewLifecycleOwner().Q(), fg7Var), new nm8(null, this), 5), getViewLifecycleScope());
    }

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, "chat_id");
        this.b = new fs(suc.class, Widget.ARG_SCOPE_ID);
        final int i = 0;
        this.c = createViewModelLazy(dm8.class, new nj4(29, new k56(this) { // from class: lm8
            public final /* synthetic */ MediaTypePickerWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                MediaTypePickerWidget mediaTypePickerWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = MediaTypePickerWidget.Y;
                        bc7 bc7Var = bc7VarArr[1];
                        bm8 bm8Var = (bm8) mediaTypePickerWidget.m41getSharedViewModelcp94BC8(((suc) mediaTypePickerWidget.b.a(mediaTypePickerWidget)).a, bm8.class, null).getValue();
                        bc7 bc7Var2 = bc7VarArr[0];
                        return new dm8(bm8Var, ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue());
                    default:
                        bc7[] bc7VarArr2 = MediaTypePickerWidget.Y;
                        tl8 tl8Var = new tl8(mediaTypePickerWidget.getContext());
                        dm8 dm8VarM0 = mediaTypePickerWidget.m0();
                        dm8VarM0.getClass();
                        kl7 kl7VarL = j1e.l();
                        kl7VarL.add(gm8.a);
                        e52 e52Var = (e52) ((jz2) ((iy2) dm8VarM0.s0.getValue())).m(dm8VarM0.c).a.getValue();
                        je7 je7Var = dm8VarM0.Z;
                        if (e52Var != null) {
                            boolean z = e52Var.b.a != 0;
                            boolean z2 = e52Var.M() && !e52Var.H();
                            qyc qycVar = (qyc) ((y7d) je7Var.getValue());
                            qycVar.getClass();
                            if (qycVar.q(PmsKey.f85moneytransferbotid, 0L) != 0 && z2 && z) {
                                kl7VarL.add(im8.a);
                            }
                        }
                        qyc qycVar2 = (qyc) ((y7d) je7Var.getValue());
                        qycVar2.getClass();
                        if (qycVar2.n(PmsKey.f110sendlocationenabled, false)) {
                            kl7VarL.add(hm8.a);
                        }
                        kl7VarL.add(em8.a);
                        kl7VarL.add(fm8.a);
                        tl8Var.setState(j1e.d(kl7VarL));
                        tl8Var.setOnClickListener(new om8(1, mediaTypePickerWidget.m0(), dm8.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0, 0));
                        if (tl8Var.isAttachedToWindow()) {
                            tl8Var.setPadding(tl8Var.getPaddingLeft(), tl8Var.getPaddingTop(), tl8Var.getPaddingRight(), tu0.G((x6g.f(null, tl8Var.getRootWindowInsets()).a.f(2).d > 0 ? 2 : 8) * fk4.d().getDisplayMetrics().density));
                        } else {
                            tl8Var.addOnAttachStateChangeListener(new o50(tl8Var, 5, tl8Var));
                        }
                        return tl8Var;
                }
            }
        }));
        final int i2 = 1;
        this.o = binding(new k56(this) { // from class: lm8
            public final /* synthetic */ MediaTypePickerWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                MediaTypePickerWidget mediaTypePickerWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = MediaTypePickerWidget.Y;
                        bc7 bc7Var = bc7VarArr[1];
                        bm8 bm8Var = (bm8) mediaTypePickerWidget.m41getSharedViewModelcp94BC8(((suc) mediaTypePickerWidget.b.a(mediaTypePickerWidget)).a, bm8.class, null).getValue();
                        bc7 bc7Var2 = bc7VarArr[0];
                        return new dm8(bm8Var, ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue());
                    default:
                        bc7[] bc7VarArr2 = MediaTypePickerWidget.Y;
                        tl8 tl8Var = new tl8(mediaTypePickerWidget.getContext());
                        dm8 dm8VarM0 = mediaTypePickerWidget.m0();
                        dm8VarM0.getClass();
                        kl7 kl7VarL = j1e.l();
                        kl7VarL.add(gm8.a);
                        e52 e52Var = (e52) ((jz2) ((iy2) dm8VarM0.s0.getValue())).m(dm8VarM0.c).a.getValue();
                        je7 je7Var = dm8VarM0.Z;
                        if (e52Var != null) {
                            boolean z = e52Var.b.a != 0;
                            boolean z2 = e52Var.M() && !e52Var.H();
                            qyc qycVar = (qyc) ((y7d) je7Var.getValue());
                            qycVar.getClass();
                            if (qycVar.q(PmsKey.f85moneytransferbotid, 0L) != 0 && z2 && z) {
                                kl7VarL.add(im8.a);
                            }
                        }
                        qyc qycVar2 = (qyc) ((y7d) je7Var.getValue());
                        qycVar2.getClass();
                        if (qycVar2.n(PmsKey.f110sendlocationenabled, false)) {
                            kl7VarL.add(hm8.a);
                        }
                        kl7VarL.add(em8.a);
                        kl7VarL.add(fm8.a);
                        tl8Var.setState(j1e.d(kl7VarL));
                        tl8Var.setOnClickListener(new om8(1, mediaTypePickerWidget.m0(), dm8.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0, 0));
                        if (tl8Var.isAttachedToWindow()) {
                            tl8Var.setPadding(tl8Var.getPaddingLeft(), tl8Var.getPaddingTop(), tl8Var.getPaddingRight(), tu0.G((x6g.f(null, tl8Var.getRootWindowInsets()).a.f(2).d > 0 ? 2 : 8) * fk4.d().getDisplayMetrics().density));
                        } else {
                            tl8Var.addOnAttachStateChangeListener(new o50(tl8Var, 5, tl8Var));
                        }
                        return tl8Var;
                }
            }
        });
        this.X = (an9) to2.a.getAccessor().c(an9.class);
    }
}
