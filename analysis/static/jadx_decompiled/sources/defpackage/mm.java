package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mm {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ mm(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableA = gd3.a(compoundButton);
        if (drawableA != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.c) {
                    aq4.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    aq4.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    aq4.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    aq4.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.a = null;
        }
        return bundle2;
    }

    public hsc d() {
        String str;
        hsc hscVar;
        Iterator it = ((rqc) this.f).iterator();
        do {
            nqc nqcVar = (nqc) it;
            if (!nqcVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) nqcVar.next();
            str = (String) entry.getKey();
            hscVar = (hsc) entry.getValue();
        } while (!tpa.f(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return hscVar;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        Object obj = this.f;
        CompoundButton compoundButton = (CompoundButton) obj;
        k8g k8gVarX = k8g.x(compoundButton.getContext(), attributeSet, p3c.CompoundButton, i, 0);
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        CompoundButton compoundButton2 = (CompoundButton) obj;
        Context context = compoundButton2.getContext();
        int[] iArr = p3c.CompoundButton;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(compoundButton2, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        try {
            if (typedArray.hasValue(p3c.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(p3c.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(s36.n(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(p3c.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(p3c.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(s36.n(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(p3c.CompoundButton_buttonTint)) {
                fd3.c(compoundButton, k8gVarX.l(p3c.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(p3c.CompoundButton_buttonTintMode)) {
                fd3.d(compoundButton, hq4.c(typedArray.getInt(p3c.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            k8gVarX.z();
        }
    }

    public void f(String str, hsc hscVar) {
        if (((hsc) ((rqc) this.f).b(str, hscVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public void g() {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        gm gmVar = (gm) this.b;
        if (gmVar == null) {
            gmVar = new gm(this);
        }
        this.b = gmVar;
        try {
            nf7.class.getDeclaredConstructor(null);
            gm gmVar2 = (gm) this.b;
            if (gmVar2 != null) {
                ((LinkedHashSet) gmVar2.b).add(nf7.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + nf7.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public mm() {
        this.f = new rqc();
        this.e = true;
    }
}
