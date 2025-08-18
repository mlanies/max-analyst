package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class ma6 {
    public static final ssc q = ssc.m;
    public static final ssc r = ssc.l;
    public final Resources a;
    public int b = HttpStatus.SC_MULTIPLE_CHOICES;
    public float c = 0.0f;
    public Drawable d = null;
    public rsc e;
    public Drawable f;
    public rsc g;
    public Drawable h;
    public rsc i;
    public Drawable j;
    public rsc k;
    public rsc l;
    public Drawable m;
    public List n;
    public StateListDrawable o;
    public wnc p;

    public ma6(Resources resources) {
        this.a = resources;
        ssc sscVar = q;
        this.e = sscVar;
        this.f = null;
        this.g = sscVar;
        this.h = null;
        this.i = sscVar;
        this.j = null;
        this.k = sscVar;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final la6 a() {
        List list = this.n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).getClass();
            }
        }
        return new la6(this);
    }
}
