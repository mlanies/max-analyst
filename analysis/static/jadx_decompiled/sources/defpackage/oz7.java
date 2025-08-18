package defpackage;

import android.media.MediaCodec;
import android.net.Uri;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class oz7 implements cc3, yoe, zpa, qj3, f7b, p78, fu3 {
    public static oz7 o;
    public static final oz7 a = new oz7();
    public static final oz7 b = new oz7();
    public static final oz7 c = new oz7();
    public static final /* synthetic */ oz7 X = new oz7();

    public static final boolean c(int i) {
        int i2 = g9f.b;
        char c2 = (char) i;
        return ('a' <= c2 && c2 < '{') || ('A' <= c2 && c2 < '[') || (('0' <= c2 && c2 < ':') || c2 == '-' || c2 == '_' || c2 == '.' || c2 == '~');
    }

    public static wa1 d(String str) {
        return str.equals("action-open-call") ? sa1.a : str.equals("action-accept-call") ? na1.a : str.equals("action-finished-call") ? qa1.a : str.equals("action-decline-call") ? pa1.a : str.equals("action-open-incoming") ? ta1.a : str.equals("action-join-link") ? ra1.a : str.equals("action-microphone-state") ? oa1.a : str.equals("action-rate-call") ? ua1.a : va1.a;
    }

    public static MediaCodec e(n78 n78Var) throws IOException {
        n78Var.a.getClass();
        String str = n78Var.a.a;
        String strValueOf = String.valueOf(str);
        j47.k(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        j47.A();
        return mediaCodecCreateByCodecName;
    }

    public static int g(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return 3062500;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 8000;
            case 16:
                return 256000;
            case LangUtils.HASH_SEED /* 17 */:
                return 336000;
        }
    }

    public static o92 j(String str) {
        v25 v25Var = o92.X;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            o92 o92Var = (o92) u1Var.next();
            if (tpa.f(o92Var.a, str)) {
                return o92Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static void l(String str, String str2, String str3) {
        if (str != null && eae.o0(str, "{", false)) {
            try {
                m(new JSONObject(str), str2, str3);
            } catch (JSONException unused) {
            }
        }
    }

    public static void m(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commands");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        long jOptLong = jSONObjectOptJSONObject.optLong("tagShutdownMs");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("featureShutdownMs");
        Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("globalShutdownMs"));
        Long lValueOf2 = Long.valueOf(jOptLong2);
        Long lValueOf3 = Long.valueOf(jOptLong);
        ky7 ky7Var = new ky7();
        ju0.d(ky7Var, "system.shutdown.until.ts", lValueOf);
        ju0.d(ky7Var, "system." + str + ".shutdown.until.ts", lValueOf2);
        if (str2 != null) {
            ju0.d(ky7Var, "system." + str + '.' + str2 + ".shutdown.until.ts", lValueOf3);
        }
        ky7 ky7VarB = ky7Var.b();
        l7b l7bVar = dp3.b;
        if (l7bVar == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        AtomicReference atomicReference = (AtomicReference) ((khe) l7bVar.b).getValue();
        loop0: while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Object it = ((ly7) ky7VarB.entrySet()).iterator();
            while (((jy7) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((hy7) it).next();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    linkedHashMap.remove(str3);
                } else {
                    linkedHashMap.put(str3, value);
                }
            }
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
        }
        l7b l7bVar2 = dp3.b;
        if (l7bVar2 == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        l7bVar2.m();
    }

    public static iu8 n(int i) {
        Object next;
        Iterator it = iu8.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((iu8) next).a == i) {
                break;
            }
        }
        iu8 iu8Var = (iu8) next;
        if (iu8Var != null) {
            return iu8Var;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for MessageStatus"));
    }

    @Override // defpackage.zpa
    public Object a(Uri uri, w24 w24Var) {
        return Long.valueOf(oaf.V(new BufferedReader(new InputStreamReader(w24Var)).readLine()));
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        j47.Z(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // defpackage.yoe
    public int b(int i, CharSequence charSequence) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            char c2 = 2;
            if (i2 >= i) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            zoe zoeVar = bpe.a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality == 1 || directionality == 2) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                z = true;
            }
            i2++;
        }
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(le0.class, Executor.class)));
    }

    public bm7 h(qh8 qh8Var, oh8 oh8Var, List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tb8 tb8VarA = (tb8) it.next();
            ib8 ib8Var = tb8VarA.b;
            if (ib8Var != null) {
                ya8 ya8VarA = tb8VarA.a();
                ya8VarA.g = ay7.G(ib8Var.a, tb8VarA).toString();
                tb8VarA = ya8VarA.a();
            }
            arrayList.add(tb8VarA);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((tb8) it2.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                bw6 bw6Var = new bw6();
                bw6Var.m(unsupportedOperationException);
                return bw6Var;
            }
        }
        return fm9.F(arrayList);
    }

    @Override // defpackage.p78
    public r78 i(n78 n78Var) {
        MediaCodec mediaCodecE = null;
        try {
            mediaCodecE = e(n78Var);
            j47.k("configureCodec");
            mediaCodecE.configure(n78Var.b, n78Var.d, n78Var.e, 0);
            j47.A();
            j47.k("startCodec");
            mediaCodecE.start();
            j47.A();
            return new pl8(mediaCodecE);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecE != null) {
                mediaCodecE.release();
            }
            throw e;
        }
    }

    @Override // defpackage.f7b
    public CharSequence k(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return listPreference.a.getString(y1c.not_set);
    }

    @Override // defpackage.fu3
    public /* synthetic */ Object u(Task task) {
        qz7 qz7Var = reg.w0;
        return null;
    }
}
