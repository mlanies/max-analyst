package one.me.dialogs.share.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a10;
import defpackage.av3;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c32;
import defpackage.c7a;
import defpackage.dy7;
import defpackage.e0d;
import defpackage.eia;
import defpackage.en4;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fs;
import defpackage.hob;
import defpackage.je7;
import defpackage.ke2;
import defpackage.kia;
import defpackage.kpa;
import defpackage.le2;
import defpackage.m52;
import defpackage.md1;
import defpackage.nec;
import defpackage.od2;
import defpackage.og4;
import defpackage.p0c;
import defpackage.pnf;
import defpackage.qp4;
import defpackage.qqe;
import defpackage.re2;
import defpackage.rkd;
import defpackage.s;
import defpackage.tu0;
import defpackage.w9a;
import defpackage.wha;
import defpackage.ye2;
import defpackage.yoc;
import defpackage.z5b;
import defpackage.z6a;
import defpackage.z7;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zu3;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "share-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] E0 = {new hob(ChatMediaDownloadBottomSheet.class, "forceDarkTheme", "getForceDarkTheme()Z", 0), zr6.e(nec.a, ChatMediaDownloadBottomSheet.class, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    public final je7 A0;
    public og4 B0;
    public final fs C0;
    public final fs D0;
    public final je7 y0;
    public final je7 z0;

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(ye2.class, new s(27, new m52(11)));
        this.y0 = je7VarCreateViewModelLazy;
        this.z0 = tu0.r(3, new md1(9, this));
        this.A0 = rkd.a.getAccessor().d(wha.class);
        this.C0 = new fs(Boolean.class, "arg:force_dark");
        this.D0 = new fs(Integer.class, "arg:snack_bot_margin");
        ye2 ye2Var = (ye2) je7VarCreateViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        c32 c32Var = en4.a;
        int i = bundle.getInt("arg:cause");
        c32Var.getClass();
        ye2Var.y0 = pnf.n(ye2Var, ((w9a) ye2Var.c).b(), null, new re2(ye2Var, j, string, (en4) en4.u0.get(i), j2, null), 2);
    }

    public final void A0(int i, int i2) {
        wha whaVar = (wha) this.A0.getValue();
        whaVar.h(z7.B(getContext(), i));
        whaVar.e(new kia(i2));
        bc7 bc7Var = E0[1];
        Integer num = (Integer) this.D0.a(this);
        if (num != null) {
            whaVar.c(new eia(0, 0, num.intValue(), 3));
        }
        whaVar.i();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new ke2(this, 0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        this.B0 = zu3Var instanceof og4 ? (og4) zu3Var : null;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((ye2) this.y0.getValue()).r();
        this.B0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((ye2) this.y0.getValue()).x0, getViewLifecycleOwner().Q(), fg7.o), new le2(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        fka fkaVar = qp4.u0.o(getContext()).c;
        bc7 bc7Var = E0[0];
        if (((Boolean) this.C0.a(this)).booleanValue()) {
            return fkaVar;
        }
        return null;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(223 * fk4.d().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = tu0.G(27 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        fka fkaVarQ0 = q0();
        if (fkaVarQ0 == null) {
            fkaVarQ0 = qp4.u0.j(textView);
        }
        textView.setTextColor(fkaVarQ0.getText().e);
        a10 a10Var = (a10) this.z0.getValue();
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, a10Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(tu0.G(12 * fk4.d().getDisplayMetrics().density));
        textView.setText(p0c.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), null);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(52 * fk4.d().getDisplayMetrics().density), 81));
        oneMeButton.setCustomTheme(q0());
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(yoc.h);
        tu0.K(oneMeButton, 300L, new e0d(4, this));
        frameLayout2.addView(oneMeButton);
        return frameLayout2;
    }

    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this(dy7.g(new kpa("arg:msg_id", Long.valueOf(j)), new kpa("arg:attach_id", Long.valueOf(j2)), new kpa("arg:local_attach_id", str), new kpa("arg:cause", Integer.valueOf(i)), new kpa("arg:snack_bot_margin", num), new kpa("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}
