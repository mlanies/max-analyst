package one.me.calls.ui.bottomsheet.exit;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.ccc;
import defpackage.dcc;
import defpackage.dj3;
import defpackage.ecc;
import defpackage.eh2;
import defpackage.fcc;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fp3;
import defpackage.hob;
import defpackage.je7;
import defpackage.jp8;
import defpackage.k56;
import defpackage.kcc;
import defpackage.l2a;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.s35;
import defpackage.t03;
import defpackage.tu0;
import defpackage.ufd;
import defpackage.yz2;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lccc;", "openType", "", "enableRecordInCall", "(Lccc;Ljava/lang/Boolean;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final qm0 A0;
    public final qm0 B0;
    public final qm0 C0;
    public final qm0 D0;
    public final qm0 E0;
    public final qm0 F0;
    public final je7 y0;
    public final je7 z0;

    static {
        hob hobVar = new hob(RecordExitBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oecVar = nec.a;
        G0 = new bc7[]{hobVar, zr6.e(oecVar, RecordExitBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), zr6.f(RecordExitBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(RecordExitBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(RecordExitBottomSheet.class, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, oecVar), zr6.f(RecordExitBottomSheet.class, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0, oecVar)};
    }

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        final int i = 0;
        this.y0 = tu0.r(3, new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i2 = y7a.o1;
                        ufdVar.setId(i2);
                        ufdVar.setItemId(i2);
                        int i3 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i3);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            fArr[i4] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        this.z0 = createViewModelLazy(kcc.class, new jp8(24, new eh2(bundle, 10)));
        final int i2 = 1;
        this.A0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i3 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i3);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            fArr[i4] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        final int i3 = 2;
        this.B0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i32 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i32);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            fArr[i4] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        final int i4 = 3;
        this.C0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i32 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i32);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i42 = 0; i42 < 8; i42++) {
                            fArr[i42] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        final int i5 = 4;
        this.D0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i5) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i32 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i32);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i42 = 0; i42 < 8; i42++) {
                            fArr[i42] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        final int i6 = 5;
        this.E0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i6) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i32 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i32);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i42 = 0; i42 < 8; i42++) {
                            fArr[i42] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
        final int i7 = 6;
        this.F0 = binding(new k56(this) { // from class: bcc
            public final /* synthetic */ RecordExitBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                c7a c7aVar = c7a.c;
                pq9 pq9Var = qp4.u0;
                RecordExitBottomSheet recordExitBottomSheet = this.b;
                switch (i7) {
                    case 0:
                        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
                        return a14.m(recordExitBottomSheet.getContext());
                    case 1:
                        bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                        TextView textView = new TextView(recordExitBottomSheet.getContext());
                        textView.setId(y7a.r1);
                        i4f.c.b(textView, du4.b);
                        textView.setTextColor(pq9Var.p(textView).c.getText().e);
                        textView.setGravity(17);
                        textView.setPadding(0, tu0.G(24 * fk4.d().getDisplayMetrics().density), 0, 0);
                        return textView;
                    case 2:
                        bc7[] bc7VarArr3 = RecordExitBottomSheet.G0;
                        TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                        textView2.setId(y7a.q1);
                        i4f.p.b(textView2, du4.b);
                        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                        textView2.setGravity(17);
                        return textView2;
                    case 3:
                        bc7[] bc7VarArr4 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton.setId(y7a.m1);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7aVar);
                        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                        return oneMeButton;
                    case 4:
                        bc7[] bc7VarArr5 = RecordExitBottomSheet.G0;
                        OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), null);
                        oneMeButton2.setId(y7a.n1);
                        oneMeButton2.setAppearance(z6a.c);
                        oneMeButton2.setSize(c7aVar);
                        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
                        return oneMeButton2;
                    case 5:
                        bc7[] bc7VarArr6 = RecordExitBottomSheet.G0;
                        ufd ufdVar = new ufd(recordExitBottomSheet.getContext(), null);
                        ufdVar.setDisableStartIconText(true);
                        int i22 = y7a.o1;
                        ufdVar.setId(i22);
                        ufdVar.setItemId(i22);
                        int i32 = x7a.i0;
                        x3 x3VarF = pq9Var.p(ufdVar).c.f();
                        Drawable drawableB = kt3.b(recordExitBottomSheet.getContext(), i32);
                        if (drawableB != null) {
                            aq4.g(drawableB, x3VarF.a);
                            aq4.i(drawableB, PorterDuff.Mode.SRC_IN);
                        }
                        ufdVar.setStartIcon(drawableB);
                        ufdVar.setType(jfd.b);
                        float[] fArr = new float[8];
                        for (int i42 = 0; i42 < 8; i42++) {
                            fArr[i42] = fk4.d().getDisplayMetrics().density * 16.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
                        ufdVar.setBackground(shapeDrawable);
                        ufdVar.setThemeDepended(pfd.b);
                        return ufdVar;
                    default:
                        bc7[] bc7VarArr7 = RecordExitBottomSheet.G0;
                        yz2 yz2Var = new yz2(recordExitBottomSheet.getContext(), null);
                        yz2Var.setId(y7a.p1);
                        yz2Var.setText(b8a.w1);
                        i4f.j.b(yz2Var, du4.b);
                        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
                        je7 je7Var = recordExitBottomSheet.y0;
                        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
                        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
                        yz2Var.setChecked(false);
                        yz2Var.setVisibility(8);
                        yz2Var.setPaddingBetweenCheckbox(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        return yz2Var;
                }
            }
        });
    }

    public final yz2 A0() {
        bc7 bc7Var = G0[5];
        return (yz2) this.F0.getValue();
    }

    public final OneMeButton B0() {
        bc7 bc7Var = G0[2];
        return (OneMeButton) this.C0.getValue();
    }

    public final OneMeButton C0() {
        bc7 bc7Var = G0[3];
        return (OneMeButton) this.D0.getValue();
    }

    public final ufd D0() {
        bc7 bc7Var = G0[4];
        return (ufd) this.E0.getValue();
    }

    public final TextView E0() {
        bc7 bc7Var = G0[1];
        return (TextView) this.B0.getValue();
    }

    public final TextView F0() {
        bc7 bc7Var = G0[0];
        return (TextView) this.A0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.z0;
        s35 s35Var = ((kcc) je7Var.getValue()).u0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new dcc(null, this), 5), getViewLifecycleScope());
        if (((kcc) je7Var.getValue()).b == ccc.b) {
            od2.L(new zn5(tu0.g(((kcc) je7Var.getValue()).t0, getViewLifecycleOwner().Q(), fg7Var), new ecc(null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(new t03(((kcc) je7Var.getValue()).s0, 11), getViewLifecycleOwner().Q(), fg7Var), new fcc(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.addView(F0(), -1, -2);
        constraintLayout.addView(E0(), -1, -2);
        constraintLayout.addView(D0(), -1, -2);
        constraintLayout.addView(B0(), 0, -2);
        constraintLayout.addView(C0(), 0, -2);
        constraintLayout.addView(A0(), 0, -2);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = F0().getId();
        dj3VarQ.d(id, 3, 0, 3);
        au1.p(16, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 4, E0().getId(), 3);
        dj3VarQ.g(id).d.W = 2;
        int id2 = E0().getId();
        dj3VarQ.d(id2, 3, F0().getId(), 4);
        float f = 4;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 4, D0().getId(), 3);
        int id3 = D0().getId();
        dj3VarQ.d(id3, 3, E0().getId(), 4);
        au1.p(22, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 4, A0().getId(), 3);
        int id4 = A0().getId();
        dj3VarQ.d(id4, 3, D0().getId(), 4);
        float f2 = 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id4, 4, B0().getId(), 3);
        int id5 = B0().getId();
        dj3VarQ.d(id5, 3, A0().getId(), 4);
        new l2a(dj3VarQ, 3, id5, 4).e(tu0.G(24 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id5, 7, C0().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id5, 4));
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 4, 0, 3);
        int id6 = C0().getId();
        dj3VarQ.d(id6, 3, B0().getId(), 3);
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.d(id6, 6, B0().getId(), 7);
        new l2a(dj3VarQ, 6, id6, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id6, 4, B0().getId(), 4);
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    public /* synthetic */ RecordExitBottomSheet(ccc cccVar, Boolean bool, int i, z84 z84Var) {
        this(cccVar, (i & 2) != 0 ? null : bool);
    }

    public RecordExitBottomSheet(ccc cccVar, Boolean bool) {
        Bundle bundle = new Bundle();
        bundle.putString("open_type", cccVar.name());
        if (bool != null) {
            bundle.putBoolean("admin_record_settings", bool.booleanValue());
        }
        this(bundle);
    }
}
