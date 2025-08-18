package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t08 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ u08 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t08(u08 u08Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = u08Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u08 u08Var = this.c;
        ColorStateList colorStateList2 = u08Var.z0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (u08Var.y0 != 0 && u08Var.z0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{s63.g(u08Var.z0.getColorForState(iArr3, 0), u08Var.y0), s63.g(u08Var.z0.getColorForState(iArr2, 0), u08Var.y0), u08Var.y0});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u08 u08Var = this.c;
            Drawable rippleDrawable = null;
            if (u08Var.getText().toString().contentEquals(textView.getText()) && u08Var.y0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(u08Var.y0);
                if (this.b != null) {
                    aq4.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = zmf.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
