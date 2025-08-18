package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* loaded from: classes.dex */
public final class b16 implements LayoutInflater.Factory2 {
    public final c a;

    public b16(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        e eVarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3c.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(m3c.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(m3c.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(m3c.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = a.class.isAssignableFrom(f16.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                a aVarD = resourceId != -1 ? cVar.D(resourceId) : null;
                if (aVarD == null && string != null) {
                    aVarD = cVar.E(string);
                }
                if (aVarD == null && id != -1) {
                    aVarD = cVar.D(id);
                }
                if (aVarD == null) {
                    f16 f16VarJ = cVar.J();
                    context.getClassLoader();
                    aVarD = f16VarJ.a(attributeValue);
                    aVarD.z0 = true;
                    aVarD.J0 = resourceId != 0 ? resourceId : id;
                    aVarD.K0 = id;
                    aVarD.L0 = string;
                    aVarD.A0 = true;
                    aVarD.F0 = cVar;
                    z06 z06Var = cVar.w;
                    aVarD.G0 = z06Var;
                    Context context2 = z06Var.u0;
                    aVarD.F0(attributeSet, aVarD.b);
                    eVarG = cVar.a(aVarD);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVarD.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (aVarD.A0) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    aVarD.A0 = true;
                    aVarD.F0 = cVar;
                    z06 z06Var2 = cVar.w;
                    aVarD.G0 = z06Var2;
                    Context context3 = z06Var2.u0;
                    aVarD.F0(attributeSet, aVarD.b);
                    eVarG = cVar.g(aVarD);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVarD.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                t16 t16Var = u16.a;
                u16.b(new FragmentTagUsageViolation(aVarD, "Attempting to use <fragment> tag to add fragment " + aVarD + " to container " + viewGroup));
                u16.a(aVarD).getClass();
                aVarD.T0 = viewGroup;
                eVarG.k();
                eVarG.j();
                View view2 = aVarD.U0;
                if (view2 == null) {
                    throw new IllegalStateException(zr6.i("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (aVarD.U0.getTag() == null) {
                    aVarD.U0.setTag(string);
                }
                aVarD.U0.addOnAttachStateChangeListener(new o50(this, eVarG));
                return aVarD.U0;
            }
        }
        return null;
    }
}
