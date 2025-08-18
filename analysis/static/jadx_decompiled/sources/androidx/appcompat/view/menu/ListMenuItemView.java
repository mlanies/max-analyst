package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.br8;
import defpackage.k8g;
import defpackage.mvb;
import defpackage.p3c;
import defpackage.pr8;
import defpackage.vsb;
import defpackage.zyb;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements pr8, AbsListView.SelectionBoundsAdjuster {
    public boolean A0;
    public final Drawable B0;
    public final boolean C0;
    public LayoutInflater D0;
    public boolean E0;
    public br8 a;
    public ImageView b;
    public RadioButton c;
    public TextView o;
    public CheckBox s0;
    public TextView t0;
    public ImageView u0;
    public ImageView v0;
    public LinearLayout w0;
    public final Drawable x0;
    public final int y0;
    public final Context z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = vsb.listMenuViewStyle;
        k8g k8gVarX = k8g.x(getContext(), attributeSet, p3c.MenuView, i, 0);
        this.x0 = k8gVarX.n(p3c.MenuView_android_itemBackground);
        int i2 = p3c.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        this.y0 = typedArray.getResourceId(i2, -1);
        this.A0 = typedArray.getBoolean(p3c.MenuView_preserveIconSpacing, false);
        this.z0 = context;
        this.B0 = k8gVarX.n(p3c.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, vsb.dropDownListViewStyle, 0);
        this.C0 = typedArrayObtainStyledAttributes.hasValue(0);
        k8gVarX.z();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.D0 == null) {
            this.D0 = LayoutInflater.from(getContext());
        }
        return this.D0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.u0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.v0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v0.getLayoutParams();
        rect.top = this.v0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // defpackage.pr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.br8 r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(br8):void");
    }

    @Override // defpackage.pr8
    public br8 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.x0);
        TextView textView = (TextView) findViewById(mvb.title);
        this.o = textView;
        int i = this.y0;
        if (i != -1) {
            textView.setTextAppearance(this.z0, i);
        }
        this.t0 = (TextView) findViewById(mvb.shortcut);
        ImageView imageView = (ImageView) findViewById(mvb.submenuarrow);
        this.u0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.B0);
        }
        this.v0 = (ImageView) findViewById(mvb.group_divider);
        this.w0 = (LinearLayout) findViewById(mvb.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.A0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.c == null && this.s0 == null) {
            return;
        }
        if ((this.a.I0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(zyb.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.w0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.s0;
        } else {
            if (this.s0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(zyb.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.s0 = checkBox;
                LinearLayout linearLayout2 = this.w0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.s0;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.s0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.I0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(zyb.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.w0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.s0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(zyb.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.s0 = checkBox;
                LinearLayout linearLayout2 = this.w0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.s0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.E0 = z;
        this.A0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.v0;
        if (imageView != null) {
            imageView.setVisibility((this.C0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.a.y0.getClass();
        boolean z = this.E0;
        if (z || this.A0) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.A0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(zyb.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.w0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.A0) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.o.getVisibility() != 8) {
                this.o.setVisibility(8);
            }
        } else {
            this.o.setText(charSequence);
            if (this.o.getVisibility() != 0) {
                this.o.setVisibility(0);
            }
        }
    }
}
