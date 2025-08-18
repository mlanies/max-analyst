package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pi3 {
    public boolean a = false;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public pi3(pi3 pi3Var, Object obj) {
        pi3Var.getClass();
        this.b = pi3Var.b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i3c.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == i3c.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == i3c.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == i3c.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == i3c.CustomAttribute_customColorValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == i3c.CustomAttribute_customColorDrawableValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == i3c.CustomAttribute_customPixelDimension) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i3c.CustomAttribute_customDimension) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i3c.CustomAttribute_customFloatValue) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == i3c.CustomAttribute_customIntegerValue) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == i3c.CustomAttribute_customStringValue) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == i3c.CustomAttribute_customReference) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (string != null && objValueOf != null) {
            pi3 pi3Var = new pi3();
            pi3Var.b = i;
            pi3Var.a = z;
            pi3Var.b(objValueOf);
            map.put(string, pi3Var);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (au1.s(this.b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                break;
            case 1:
                this.d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                break;
            case 4:
                this.e = (String) obj;
                break;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
