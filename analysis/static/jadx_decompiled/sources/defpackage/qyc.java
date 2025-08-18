package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class qyc extends e3 implements y7d {
    public static final nz4 n;
    public static final khe o;
    public final xs h;
    public final khe i;
    public final fic j;
    public final fic k;
    public final CopyOnWriteArraySet l;
    public final khe m;

    static {
        y53.M("TOP", "NEW");
        y53.M("RECENT", "NEW", "TOP");
        n = nz4.a;
        o = new khe(new hbc(13));
    }

    public qyc(Context context, mi5 mi5Var) {
        super(context, "settings.prefs", mi5Var);
        this.h = new xs(1);
        this.i = new khe(new re5(this, 1));
        this.j = new fic(new re5(this, 2));
        this.k = new fic(new xda(context, 26));
        this.l = new CopyOnWriteArraySet();
        this.m = new khe(new re5(this, 3));
    }

    public final boolean n(Enum r1, boolean z) {
        return this.g.getBoolean(r1.name(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final List o(Enum r3, List list) {
        JSONArray jSONArray = null;
        String strG = g(r3.name(), null);
        if (strG != null) {
            try {
                jSONArray = new JSONArray(strG);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray != null) {
            list = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(Integer.valueOf(jSONArray.getInt(i)));
                } catch (Throwable unused2) {
                }
            }
        }
        return list;
    }

    public final String p() {
        return s(PmsKey.f52invitelink, "https://max.ru");
    }

    public final long q(Enum r3, long j) {
        Number numberValueOf;
        try {
            numberValueOf = Long.valueOf(f(r3.name(), j));
        } catch (ClassCastException unused) {
            numberValueOf = Integer.valueOf(this.e(r3.name(), (int) j));
        }
        return numberValueOf.longValue();
    }

    public final int r() {
        return (int) q(PmsKey.f65maxdescriptionlength, HttpStatus.SC_BAD_REQUEST);
    }

    public final String s(Enum r1, String str) {
        String strW = w(r1, str);
        if (strW != null) {
            return strW;
        }
        throw new IllegalArgumentException(("got null string value for " + r1).toString());
    }

    public final List t(Enum r2, List list) {
        List listH = h(r2.name(), list);
        if (listH != null) {
            return listH;
        }
        throw new IllegalArgumentException(("got null stringlist value for " + r2).toString());
    }

    public final boolean u() {
        return n(PmsKey.f32draftssyncenabled, false);
    }

    public final boolean v() {
        return n(PmsKey.f106safemodeenabled, false);
    }

    public final String w(Enum r1, String str) {
        return g(r1.name(), str);
    }
}
