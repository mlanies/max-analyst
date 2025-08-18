package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class js4 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile ngg e;
    public final Object f;

    public js4(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException(("File " + file + " not in directory").toString());
        }
        this.b = parentFile;
        this.c = lk5.J(parentFile, file.getName() + ".tmp");
        this.d = lk5.J(parentFile, file.getName() + ".taken");
        this.e = hs4.d;
        this.f = new Object();
    }

    public final void a(List list) {
        List listB;
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            ngg nggVar = this.e;
            if ((nggVar instanceof is4) && list == ((List) ((is4) nggVar).d.get())) {
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new gs4(list);
                return;
            }
            ngg nggVar2 = this.e;
            if (nggVar2 instanceof hs4) {
                listB = b();
            } else if (nggVar2 instanceof gs4) {
                listB = ((gs4) nggVar2).d;
            } else {
                if (!(nggVar2 instanceof is4)) {
                    throw new NoWhenBranchMatchedException();
                }
                listB = nz4.a;
            }
            List listG = nd2.g(listB, list);
            c(listG);
            this.e = new gs4(listG);
        }
    }

    public final List b() {
        File file = this.a;
        boolean zExists = file.exists();
        nz4 nz4Var = nz4.a;
        if (!zExists) {
            return nz4Var;
        }
        try {
            JSONArray jSONArray = new JSONArray(lk5.I(file));
            kl7 kl7VarL = j1e.l();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                kl7VarL.add(new ls4(jSONObject.getString("event"), jSONObject.getString("reason"), jSONObject.getInt(NewHtcHomeBadger.COUNT)));
            }
            return j1e.d(kl7VarL);
        } catch (IOException unused) {
            Objects.toString(file);
            return nz4Var;
        } catch (JSONException unused2) {
            Objects.toString(file);
            try {
                m6d.k(file);
            } catch (IOException unused3) {
                Objects.toString(file);
            }
            return nz4Var;
        }
    }

    public final void c(List list) throws JSONException {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ls4 ls4Var = (ls4) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", ls4Var.a);
            jSONObject.put("reason", ls4Var.b);
            jSONObject.put(NewHtcHomeBadger.COUNT, ls4Var.c);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        try {
            m6d.y(this.b);
            lk5.K(file, string);
            m6d.K(file, file2);
        } catch (IOException unused) {
            Objects.toString(file2);
            try {
                m6d.k(file2);
            } catch (IOException unused2) {
                Objects.toString(file2);
            }
        }
    }

    public final List d() {
        List listB;
        ngg nggVar = this.e;
        if ((!(nggVar instanceof gs4) || !((gs4) nggVar).d.isEmpty()) && !(nggVar instanceof is4)) {
            synchronized (this.f) {
                try {
                    ngg nggVar2 = this.e;
                    if (nggVar2 instanceof hs4) {
                        listB = b();
                    } else {
                        if (!(nggVar2 instanceof gs4)) {
                            if (!(nggVar2 instanceof is4)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return nz4.a;
                        }
                        listB = ((gs4) nggVar2).d;
                    }
                    if (!listB.isEmpty()) {
                        this.a.renameTo(this.d);
                        this.e = new is4(listB);
                    } else {
                        this.e = new gs4(nz4.a);
                    }
                    return listB;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nz4.a;
    }
}
