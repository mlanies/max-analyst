package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;
import android.net.Uri;
import androidx.recyclerview.widget.b;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.api.core.ApiCaptchaException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiInvocationParamException;
import ru.ok.android.api.core.ApiLoginException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.session.ApiRecreateSessionException;
import ru.ok.android.api.session.ApiSessionChangedException;
import ru.ok.tracer.upload.SampleUploadWorker;

/* loaded from: classes2.dex */
public final class nd2 implements za7, b66, b7b, ht1, jw5, df9, edc, xld, Provider {
    public final /* synthetic */ int a;
    public static final nd2 b = new nd2(1);
    public static final nd2 c = new nd2(2);
    public static final nd2 o = new nd2(3);
    public static final nd2 X = new nd2(4);
    public static final nd2 Y = new nd2(6);

    public /* synthetic */ nd2(int i) {
        this.a = i;
    }

    public static final String d(Uri uri) {
        String string = uri.toString();
        return string.length() > 30 ? string.substring(0, 30).concat("...") : string;
    }

    public static final void f(wv6 wv6Var) {
        if (!(wv6Var.l.a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    public static List g(List list, List list2) {
        if (list.isEmpty()) {
            return x53.x0(list2, fs4.b);
        }
        if (list2.isEmpty()) {
            return list;
        }
        kl7 kl7VarL = j1e.l();
        kl7VarL.addAll(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            h(kl7VarL, (ls4) it.next());
        }
        if (kl7VarL.getSize() > 15) {
            ld7 ld7Var = new ld7(n4c.a);
            int i = 0;
            while (kl7VarL.getSize() > 14) {
                i += ((ls4) kl7VarL.a(ld7Var.nextInt(kl7VarL.getSize()))).c;
            }
            h(kl7VarL, new ls4("unknown", "max_size_exceeded", i));
        }
        return j1e.d(kl7VarL);
    }

    public static void h(kl7 kl7Var, ls4 ls4Var) {
        int i;
        int size = kl7Var.getSize();
        y53.P(kl7Var.getSize(), 0, size);
        int i2 = size - 1;
        int i3 = 0;
        while (true) {
            if (i3 > i2) {
                i = -(i3 + 1);
                break;
            }
            i = (i3 + i2) >>> 1;
            ls4 ls4Var2 = (ls4) kl7Var.get(i);
            int iCompareTo = ls4Var2.a.compareTo(ls4Var.a);
            if (iCompareTo == 0 && (iCompareTo = ls4Var2.b.compareTo(ls4Var.b)) == 0) {
                iCompareTo = 0;
            }
            if (iCompareTo >= 0) {
                if (iCompareTo <= 0) {
                    break;
                } else {
                    i2 = i - 1;
                }
            } else {
                i3 = i + 1;
            }
        }
        if (i < 0) {
            kl7Var.add((-i) - 1, ls4Var);
        } else {
            ls4 ls4Var3 = (ls4) kl7Var.get(i);
            kl7Var.set(i, new ls4(ls4Var3.a, ls4Var3.b, ls4Var3.c + ls4Var.c));
        }
    }

    public static void i(Context context, o97 o97Var, File file, String str, Long l, Map map, int i) {
        String str2 = (i & 16) != 0 ? null : str;
        Map map2 = (i & 128) != 0 ? oz4.a : map;
        long length = file.length();
        String name = file.getName();
        long longVersionCode = ote.u(context.getPackageManager(), context.getPackageName()).getLongVersionCode();
        qqd qqdVar = new qqd(9, (byte) 0);
        qqdVar.F("tracer_feature_name", o97Var.b);
        qqdVar.D("tracer_feature_uze_gzip", true);
        qqdVar.F("tracer_sample_file_path", file.getPath());
        qqdVar.E(length, "tracer_sample_file_size");
        qqdVar.F("tracer_sample_file_name", name);
        qqdVar.F("tracer_feature_tag", str2);
        qqdVar.D("tracer_has_attr1", true);
        ((HashMap) qqdVar.b).put("tracer_attr1", l);
        ((HashMap) qqdVar.b).put("tracer_custom_properties_keys", (String[]) map2.keySet().toArray(new String[0]));
        qqdVar.B(map2);
        qqdVar.E(longVersionCode, "tracer_version_code");
        d24 d24VarP = qqdVar.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kye kyeVar = kye.a;
        Object obj = kye.c().get(ote.b);
        if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
            new ph4(14).f();
        }
        s7g.d(context).a((rla) ((qla) ((qla) new qla(SampleUploadWorker.class).setConstraints(new kj3(3, false, true, true, false, -1L, -1L, x53.H0(linkedHashSet)))).setInputData(d24VarP)).build());
    }

    @Override // defpackage.ht1
    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((jle) ((hle) sd3.g.getValue())).a();
            default:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
        }
    }

    @Override // defpackage.xld
    public mn5 b(j0e j0eVar) {
        return new mqc(new a0e(j0eVar, null));
    }

    @Override // defpackage.ht1
    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.jw5
    public Widget e(String str, b bVar) {
        ChatsListWidget chatsListWidget = new ChatsListWidget(str);
        chatsListWidget.z0 = bVar;
        if (chatsListWidget.isAttached()) {
            chatsListWidget.o0().setRecycledViewPool(bVar);
        }
        return chatsListWidget;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new d9f(0);
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) throws JsonParseException {
        Object apiInvocationParamException;
        db7Var.s();
        String strH = null;
        int iD = 0;
        String strH2 = null;
        String strH3 = null;
        String strF0 = null;
        String strF02 = null;
        String strT = null;
        String strV = null;
        while (db7Var.hasNext()) {
            String strT2 = db7Var.T();
            switch (strT2.hashCode()) {
                case -1125973592:
                    if (!strT2.equals("ver_redirect_url")) {
                        db7Var.z();
                        break;
                    } else {
                        db7Var.H();
                        break;
                    }
                case -830722045:
                    if (!strT2.equals("error_field")) {
                        db7Var.z();
                        break;
                    } else {
                        strF0 = db7Var.f0();
                        break;
                    }
                case -22145738:
                    if (!strT2.equals("session_key")) {
                        db7Var.z();
                        break;
                    } else {
                        strH = db7Var.H();
                        break;
                    }
                case 96784904:
                    if (!strT2.equals("error")) {
                        db7Var.z();
                        break;
                    } else {
                        strH3 = db7Var.H();
                        break;
                    }
                case 329868490:
                    if (!strT2.equals("error_msg")) {
                        db7Var.z();
                        break;
                    } else {
                        strH3 = db7Var.H();
                        break;
                    }
                case 438353305:
                    if (!strT2.equals("session_secret_key")) {
                        db7Var.z();
                        break;
                    } else {
                        strH2 = db7Var.H();
                        break;
                    }
                case 717465530:
                    if (!strT2.equals("custom_error")) {
                        db7Var.z();
                        break;
                    } else if (db7Var.peek() == 110) {
                        db7Var.z();
                        break;
                    } else {
                        db7Var.s();
                        while (db7Var.hasNext()) {
                            strT = db7Var.T();
                            strV = db7Var.V();
                        }
                        db7Var.q();
                        break;
                    }
                case 1635686852:
                    if (!strT2.equals("error_code")) {
                        db7Var.z();
                        break;
                    } else {
                        iD = db7Var.D();
                        break;
                    }
                case 1635703681:
                    if (!strT2.equals("error_data")) {
                        db7Var.z();
                        break;
                    } else {
                        strF02 = db7Var.f0();
                        break;
                    }
                case 1636060774:
                    if (!strT2.equals("error_page")) {
                        db7Var.z();
                        break;
                    } else {
                        int iPeek = db7Var.peek();
                        if (iPeek == 110) {
                            db7Var.z();
                            break;
                        } else if (iPeek == 123) {
                            db7Var.s();
                            while (db7Var.hasNext()) {
                                String strT3 = db7Var.T();
                                if (strT3.hashCode() == 954925063 && strT3.equals("message")) {
                                    int iPeek2 = db7Var.peek();
                                    if (iPeek2 == 110) {
                                        db7Var.z();
                                    } else if (iPeek2 != 123) {
                                        db7Var.H();
                                    } else {
                                        db7Var.s();
                                        while (db7Var.hasNext()) {
                                            String strT4 = db7Var.T();
                                            if (strT4.hashCode() == 106748362 && strT4.equals("plain")) {
                                                db7Var.H();
                                            } else {
                                                db7Var.z();
                                            }
                                        }
                                        db7Var.q();
                                    }
                                } else {
                                    db7Var.z();
                                }
                            }
                            db7Var.q();
                            break;
                        } else {
                            db7Var.H();
                            break;
                        }
                    }
                    break;
                default:
                    db7Var.z();
                    break;
            }
        }
        db7Var.q();
        if (iD == 100) {
            apiInvocationParamException = new ApiInvocationParamException(strH3, strF0, 100, strF02, strT, strV);
        } else {
            if (iD == 107) {
                if (strH == null) {
                    throw new JsonParseException("No sessionKey");
                }
                if (strH2 != null) {
                    return new ApiSessionChangedException(strH3, strH, strH2);
                }
                throw new JsonParseException("No sessionSecretKey");
            }
            apiInvocationParamException = iD != 401 ? iD != 403 ? (iD == 102 || iD == 103) ? new ApiRecreateSessionException(iD, strH3) : new ApiInvocationException(strH3, strF0, iD, strF02, strT, strV) : new ApiCaptchaException(strH3, strF0, HttpStatus.SC_FORBIDDEN, strF02, strT, strV) : new ApiLoginException(strH3, strF0, HttpStatus.SC_UNAUTHORIZED, strF02, strT, strV);
        }
        return apiInvocationParamException;
    }

    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        mud mudVar;
        String message;
        if (!(unsatisfiedLinkError instanceof mud) || (unsatisfiedLinkError instanceof lud) || (message = (mudVar = (mud) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = mudVar.a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (nud nudVar : nudVarArr) {
            if (nudVar instanceof of0) {
                of0 of0Var = (of0) nudVar;
                try {
                    of0Var.getClass();
                    of0Var.d(2);
                } catch (Exception unused) {
                    of0Var.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.df9
    public Object r(gy8 gy8Var) {
        long jM = 0;
        try {
            jM = lz7.M(gy8Var, 0L);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(jM);
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public String toString() {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
