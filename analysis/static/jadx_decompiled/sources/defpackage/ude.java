package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ude extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public ude(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, android.view.Menu r19) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ude.b(android.content.res.XmlResourceParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof wq8)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof wq8) {
                    wq8 wq8Var = (wq8) menu;
                    if (!wq8Var.A0) {
                        wq8Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((wq8) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((wq8) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
