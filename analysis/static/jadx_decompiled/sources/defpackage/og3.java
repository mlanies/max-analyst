package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class og3 extends LinearLayout implements kre {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final LinkedHashMap o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [android.view.View, one.me.sdk.uikit.common.button.OneMeButton] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, og3] */
    public og3(ConfirmationBottomSheet confirmationBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        ImageView imageView;
        TextView textView;
        ?? textView2;
        int i;
        z6a z6aVar;
        super(context);
        int i2 = 1;
        bc7[] bc7VarArr = ConfirmationBottomSheet.G0;
        confirmationBottomSheet.getClass();
        bc7[] bc7VarArr2 = ConfirmationBottomSheet.G0;
        bc7 bc7Var = bc7VarArr2[0];
        Integer num = (Integer) confirmationBottomSheet.y0.a(confirmationBottomSheet);
        if (num != null) {
            int iIntValue = num.intValue();
            imageView = new ImageView(getContext());
            imageView.setBackground(new ShapeDrawable(new OvalShape()));
            int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
            imageView.setPadding(iG, iG, iG, iG);
            imageView.setImageResource(iIntValue);
            float f = 80;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            layoutParams.gravity = 1;
            layoutParams.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
            layoutParams.bottomMargin = tu0.G(5 * fk4.d().getDisplayMetrics().density);
            addView(imageView, layoutParams);
        } else {
            imageView = null;
        }
        this.a = imageView;
        TextView textView3 = new TextView(getContext());
        i4f.c.b(textView3, du4.b);
        textView3.setText(charSequence);
        int i3 = 17;
        textView3.setGravity(17);
        float f2 = 12;
        textView3.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), textView3.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f2), textView3.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        float f3 = 16;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        bc7 bc7Var2 = bc7VarArr2[2];
        layoutParams2.bottomMargin = tu0.G(((jqe) confirmationBottomSheet.A0.a(confirmationBottomSheet)) == null ? fk4.d().getDisplayMetrics().density * f3 : fk4.d().getDisplayMetrics().density * f2);
        addView(textView3, layoutParams2);
        this.b = textView3;
        if (charSequence2 != null) {
            textView = new TextView(getContext());
            i4f.n.b(textView, du4.b);
            textView.setText(charSequence2);
            textView.setGravity(17);
            textView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), textView.getPaddingTop(), tu0.G(f2 * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            layoutParams3.bottomMargin = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
            addView(textView, layoutParams3);
        } else {
            textView = null;
        }
        this.c = textView;
        int iZ = mz7.Z(z53.S(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ >= 16 ? iZ : 16);
        for (Object obj : arrayList) {
            mg3 mg3Var = (mg3) obj;
            int i4 = mg3Var.a;
            boolean z = mg3Var.o;
            jqe jqeVar = mg3Var.b;
            if (z) {
                CharSequence charSequenceB = jqeVar.b(getContext());
                textView2 = new OneMeButton(getContext(), null);
                textView2.setText(charSequenceB);
                int i5 = mg3Var.c;
                textView2.setMode(i5 == 3 ? b7a.a : b7a.b);
                int iS = au1.s(i5);
                if (iS == 0) {
                    z6aVar = z6a.b;
                } else if (iS == 1 || iS == 2) {
                    z6aVar = z6a.c;
                } else {
                    if (iS != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z6aVar = z6a.o;
                }
                textView2.setAppearance(z6aVar);
                tu0.K(textView2, 300L, new kg3(i4, i2, confirmationBottomSheet));
                float f4 = 15;
                textView2.setPadding(textView2.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f4), textView2.getPaddingRight(), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                layoutParams4.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                addView(textView2, layoutParams4);
                i = 0;
                i3 = 17;
            } else {
                CharSequence charSequenceB2 = jqeVar.b(getContext());
                textView2 = new TextView(getContext());
                i4f.C.b(textView2, du4.b);
                textView2.setText(charSequenceB2);
                textView2.setGravity(17);
                i = 0;
                tu0.K(textView2, 300L, new kg3(i4, i, confirmationBottomSheet));
                float f5 = 15;
                textView2.setPadding(textView2.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f5), textView2.getPaddingRight(), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                i3 = 17;
                layoutParams5.gravity = 17;
                addView(textView2, layoutParams5);
            }
            linkedHashMap.put(textView2, obj);
        }
        this.o = linkedHashMap;
        setOrientation(1);
        setGravity(i3);
        onThemeChanged(qp4.u0.j(this));
    }

    public final Map<View, mg3> getButtonViews() {
        return this.o;
    }

    public final TextView getDescriptionView() {
        return this.c;
    }

    public final ImageView getIconView() {
        return this.a;
    }

    public final TextView getTitleView() {
        return this.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int i;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().i));
            Drawable background = imageView.getBackground();
            if (background != null) {
                background.setTint(fkaVar.b().a.g);
            }
        }
        this.b.setTextColor(fkaVar.getText().e);
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(fkaVar.getText().g);
        }
        for (Map.Entry entry : this.o.entrySet()) {
            View view = (View) entry.getKey();
            mg3 mg3Var = (mg3) entry.getValue();
            if (view instanceof OneMeButton) {
                ((OneMeButton) view).onThemeChanged(fkaVar);
            } else if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                int iS = au1.s(mg3Var.c);
                if (iS == 0) {
                    i = fkaVar.getText().b;
                } else if (iS == 1) {
                    i = fkaVar.getText().h;
                } else if (iS == 2) {
                    i = fkaVar.getText().e;
                } else {
                    if (iS != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = fkaVar.getText().j;
                }
                textView2.setTextColor(i);
            } else {
                continue;
            }
        }
    }
}
