package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class kp7 implements qj3, b7b, b66, za7, bw7, pl0, m88, n88, km7, fa8 {
    public final /* synthetic */ int a;

    public /* synthetic */ kp7(int i) {
        this.a = i;
    }

    @Override // defpackage.m88, defpackage.n88
    public int a(Object obj) {
        switch (this.a) {
            case 18:
                String str = ((x78) obj).a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (maf.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 19:
                String str2 = ((y78) obj).a;
                if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                    return 1;
                }
                return (oaf.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 20:
                return ((x78) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                return ((y78) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                hm9.p("lp7", "Can't load frames", th);
                break;
            default:
                hm9.p("yx7", "Got error on chat invalidation", th);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                return obj.toString();
            case 3:
            case 4:
            default:
                List<vpb> list = (List) obj;
                wx7 wx7Var = wx7.b;
                ArrayList arrayList = new ArrayList(list.size());
                for (vpb vpbVar : list) {
                    try {
                        arrayList.add(new kzc(5, null, vpbVar.b, null, null, null, 0L, vpbVar));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return new xx7(wx7Var, arrayList);
            case 5:
                return ((upb) obj).c;
            case 6:
                hm9.p("yx7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 7:
                hm9.p("yx7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 8:
                return new xx7(wx7.c, (List) obj);
            case 9:
                hm9.p("yx7", "searchChatsAndMessage: search local chats exception", (Throwable) obj);
                return Collections.emptyList();
            case 10:
                return new xx7(wx7.a, (List) obj);
        }
    }

    public Object b() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new h08();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new lx1();
            case 16:
                return new j5b();
            default:
                return new x13();
        }
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) {
        switch (this.a) {
            case 23:
                if (w98Var.isConnected()) {
                    a98 a98Var = w98Var.a;
                    a98Var.getClass();
                    fm9.k(Looper.myLooper() == a98Var.X.getLooper());
                    a98Var.o.getClass();
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                zr6.o(w98Var);
                throw null;
            case 25:
                w98Var.h.f(26, new ta4(20));
                return;
            case 26:
                a98 a98Var2 = w98Var.a;
                Objects.requireNonNull(a98Var2);
                a98Var2.G(new nn6(9, a98Var2));
                return;
            case 27:
                zr6.o(w98Var);
                throw null;
            case 28:
                if (w98Var.isConnected()) {
                    a98 a98Var3 = w98Var.a;
                    a98Var3.getClass();
                    fm9.k(Looper.myLooper() == a98Var3.X.getLooper());
                    a98Var3.o.getClass();
                    return;
                }
                return;
            default:
                if (w98Var.isConnected()) {
                    a98 a98Var4 = w98Var.a;
                    a98Var4.getClass();
                    fm9.k(Looper.myLooper() == a98Var4.X.getLooper());
                    a98Var4.o.getClass();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((n3b) obj).h(1);
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        eu7 eu7Var = new eu7();
        db7Var.s();
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            switch (strT) {
                case "auth_token":
                    eu7Var.d = db7Var.H();
                    break;
                case "session_key":
                    eu7Var.b = db7Var.H();
                    break;
                case "uid":
                    eu7Var.a = db7Var.H();
                    break;
                case "session_secret_key":
                    eu7Var.c = db7Var.H();
                    break;
                case "auth_hash":
                    eu7Var.f = db7Var.H();
                    break;
                case "api_server":
                    eu7Var.e = db7Var.H();
                    break;
                default:
                    db7Var.z();
                    break;
            }
        }
        db7Var.q();
        return eu7Var;
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return !((Locale) obj).getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // defpackage.pl0
    public Object apply(Object obj, Object obj2) {
        vx7 vx7Var = (vx7) obj;
        xx7 xx7Var = (xx7) obj2;
        wx7 wx7Var = xx7Var.a;
        List list = xx7Var.b;
        synchronized (vx7Var) {
            vx7Var.a.add(wx7Var);
            ArrayList arrayList = new ArrayList(vx7Var.c);
            arrayList.addAll(b0d.c(arrayList, list));
            arrayList.sort(new ca3(3, vx7Var));
            vx7Var.c = arrayList;
        }
        return vx7Var;
    }
}
