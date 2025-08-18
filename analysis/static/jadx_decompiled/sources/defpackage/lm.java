package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class lm extends CheckedTextView implements ww4 {
    public final mm a;
    public final x8 b;
    public final io c;
    public in o;

    /* JADX WARN: Illegal instructions before constructor call */
    public lm(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int i = vsb.checkedTextViewStyle;
        vue.a(context);
        super(context, attributeSet, i);
        gse.a(getContext(), this);
        io ioVar = new io(this);
        this.c = ioVar;
        ioVar.f(attributeSet, i);
        ioVar.b();
        x8 x8Var = new x8(this);
        this.b = x8Var;
        x8Var.E(attributeSet, i);
        this.a = new mm(this);
        k8g k8gVarX = k8g.x(getContext(), attributeSet, p3c.CheckedTextView, i, 0);
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        Context context2 = getContext();
        int[] iArr = p3c.CheckedTextView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context2, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        try {
            if (typedArray.hasValue(p3c.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(p3c.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(s36.n(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(p3c.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(p3c.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(s36.n(getContext(), resourceId));
            }
            if (typedArray.hasValue(p3c.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(k8gVarX.l(p3c.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(p3c.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(hq4.c(typedArray.getInt(p3c.CheckedTextView_checkMarkTintMode, -1), null));
            }
            k8gVarX.z();
            getEmojiTextViewHelper().c(attributeSet, i);
        } catch (Throwable th) {
            k8gVarX.z();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.i();
        }
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c54.V(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar != null) {
            if (mmVar.e) {
                mmVar.e = false;
            } else {
                mmVar.e = true;
                mmVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // defpackage.ww4
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(s36.n(getContext(), i));
    }
}
