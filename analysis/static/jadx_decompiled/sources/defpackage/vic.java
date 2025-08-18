package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class vic {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, tu0 tu0Var, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceB = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) a4f.b.c(a4f.d(resources, i, string, typedValue.assetCookie, i2));
            if (typeface != null) {
                if (tu0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new do9(tu0Var, 29, typeface));
                }
                typefaceB = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        rx5 rx5VarW = c37.w(resources.getXml(i), resources);
                        if (rx5VarW != null) {
                            typefaceB = a4f.b(context, rx5VarW, resources, i, string, typedValue.assetCookie, i2, tu0Var, z);
                        } else if (tu0Var != null) {
                            tu0Var.c(-3);
                        }
                    } else {
                        Typeface typefaceC = a4f.c(resources, i, string, typedValue.assetCookie, i2);
                        if (tu0Var != null) {
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new do9(tu0Var, 29, typefaceC));
                            } else {
                                tu0Var.c(-3);
                            }
                        }
                        typefaceB = typefaceC;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (tu0Var != null) {
                        tu0Var.c(-3);
                    }
                }
            }
        } else if (tu0Var != null) {
            tu0Var.c(-3);
        }
        if (typefaceB != null || tu0Var != null || z2) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
