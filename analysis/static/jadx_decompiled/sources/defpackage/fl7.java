package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;

/* loaded from: classes2.dex */
public final class fl7 implements al {
    public static final fl7 q;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    static {
        tk7 tk7Var = new tk7();
        tk7Var.a = "https";
        tk7Var.b = "max";
        tk7Var.c = "api.oneme.ru";
        tk7Var.d = "443";
        tk7Var.e = "max.ru";
        tk7Var.f = "api-test.oneme.ru";
        tk7Var.g = "api-tg.oneme.ru";
        tk7Var.h = "api";
        tk7Var.i = "chat";
        tk7Var.j = ConversationStartedStat.CALL_TYPE_JOIN;
        tk7Var.k = ConversationStartedStat.CALL_TYPE_JOIN;
        tk7Var.l = "joincall";
        tk7Var.m = "u";
        tk7Var.n = "stickerset";
        tk7Var.o = "startapp";
        tk7Var.p = ":folder";
        q = new fl7(tk7Var);
    }

    public fl7(tk7 tk7Var) {
        this.a = tk7Var.a;
        this.b = tk7Var.b;
        this.c = tk7Var.c;
        this.d = tk7Var.d;
        this.e = tk7Var.e;
        this.f = tk7Var.f;
        this.g = tk7Var.g;
        this.h = tk7Var.h;
        this.i = tk7Var.i;
        this.j = tk7Var.j;
        this.k = tk7Var.k;
        this.l = tk7Var.l;
        this.m = tk7Var.m;
        this.n = tk7Var.n;
        this.o = tk7Var.o;
        this.p = tk7Var.p;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme(this.a).authority(this.e).appendPath(str.replace("@", "")).build().toString();
    }

    public final List b(p82 p82Var, Uri uri) {
        el7 el7VarC = c(uri, new sk7(this, 0));
        p82Var.e();
        ArrayList arrayList = null;
        for (e52 e52Var : p82Var.h.values()) {
            try {
                String str = e52Var.b.I;
                if (TextUtils.isEmpty(str) ? false : el7VarC.equals(c(Uri.parse(str), new sk7(this, 0)))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e52Var);
                }
            } catch (Exception e) {
                hm9.q("p82", "exception in traverse predicate: %s", e.getMessage());
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final el7 c(Uri uri, b7b b7bVar) {
        boolean zTest;
        int i;
        List<String> pathSegments = e(uri).getPathSegments();
        int i2 = 0;
        String str = !pathSegments.isEmpty() ? pathSegments.get(0) : null;
        if (TextUtils.isEmpty(str)) {
            zTest = false;
        } else {
            try {
                zTest = b7bVar.test(str);
            } catch (Throwable th) {
                hm9.p("fl7", "getLinkEntity: privacyPredicate fail", th);
            }
        }
        if (zTest) {
            while (true) {
                if (i2 >= pathSegments.size()) {
                    i = -1;
                    break;
                }
                if (pathSegments.get(i2).equals(this.j)) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
            if (i != -1 && i < pathSegments.size()) {
                str = pathSegments.get(i);
            }
        }
        return new el7(str, zTest);
    }

    public final boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        boolean zIsEmpty = TextUtils.isEmpty(uri.getScheme());
        String str = this.g;
        String str2 = this.f;
        String str3 = this.e;
        if (!zIsEmpty) {
            String host = uri.getHost();
            if (uri.getScheme().equalsIgnoreCase(this.b)) {
                if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                    return false;
                }
                if (!host.equalsIgnoreCase(this.i) && !host.equalsIgnoreCase(this.h)) {
                    return false;
                }
            } else {
                if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                    return false;
                }
                if (!host.equalsIgnoreCase(str3) && !host.equalsIgnoreCase(str2) && !host.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        } else {
            if (pathSegments.isEmpty()) {
                return false;
            }
            String str4 = pathSegments.get(0);
            if (TextUtils.isEmpty(str4) || pathSegments.size() <= 1) {
                return false;
            }
            if (!str4.equalsIgnoreCase(str3) && !str4.equalsIgnoreCase(str2) && !str4.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final Uri e(Uri uri) {
        String string = uri.toString();
        boolean zStartsWith = string.startsWith(":");
        String str = this.b;
        if (!zStartsWith) {
            if (!string.startsWith(str + "://:")) {
                if (string.startsWith("@") || string.contains("://") || !TextUtils.isEmpty(uri.getScheme())) {
                    return uri;
                }
                return Uri.parse("https://" + uri);
            }
        }
        return c54.h(string.replace(str + "://:", ":"), str, null);
    }
}
