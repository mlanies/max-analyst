package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import defpackage.gse;
import defpackage.in;
import defpackage.io;
import defpackage.mm;
import defpackage.s36;
import defpackage.vsb;
import defpackage.vue;
import defpackage.ww4;
import defpackage.x8;
import defpackage.xue;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements xue, ww4 {
    public final mm a;
    public final x8 b;
    public final io c;
    public in o;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.checkboxStyle);
    }

    private in getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new in(this);
        }
        return this.o;
    }

    @Override // defpackage.ww4
    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.i();
        }
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.b;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.b;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    @Override // defpackage.xue
    public ColorStateList getSupportButtonTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (PorterDuff.Mode) mmVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar != null) {
            if (mmVar.e) {
                mmVar.e = false;
            } else {
                mmVar.e = true;
                mmVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // defpackage.ww4
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    @Override // defpackage.xue
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.a();
        }
    }

    @Override // defpackage.xue
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        io ioVar = this.c;
        ioVar.i(colorStateList);
        ioVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        io ioVar = this.c;
        ioVar.j(mode);
        ioVar.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        gse.a(getContext(), this);
        mm mmVar = new mm(this);
        this.a = mmVar;
        mmVar.e(attributeSet, i);
        x8 x8Var = new x8(this);
        this.b = x8Var;
        x8Var.E(attributeSet, i);
        io ioVar = new io(this);
        this.c = ioVar;
        ioVar.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(s36.n(getContext(), i));
    }
}
