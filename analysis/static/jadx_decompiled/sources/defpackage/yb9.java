package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.Trace;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class yb9 implements b66, cc3, yoe, df9, b7b, q78, ofc {
    public static yb9 Y;
    public static final yb9 a = new yb9();
    public static final yb9 b = new yb9();
    public static final yb9 c = new yb9();
    public static final /* synthetic */ yb9 o = new yb9();
    public static final yb9 X = new yb9();
    public static final /* synthetic */ yb9 Z = new yb9();

    public static MediaCodec a(o78 o78Var) throws IOException {
        o78Var.a.getClass();
        String str = o78Var.a.a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static String c(short s) {
        return String.format("0x%s", Arrays.copyOf(new Object[]{Integer.toHexString(s & 65535)}, 1));
    }

    public static int d(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
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
            default:
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return 3062500;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return 8000;
                    case 16:
                        return 256000;
                    case LangUtils.HASH_SEED /* 17 */:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static zad e(JSONObject jSONObject) {
        return jSONObject.has("roomId") ? new yad(jSONObject.getInt("roomId")) : xad.a;
    }

    public static String g(gq9 gq9Var) {
        if (gq9Var instanceof bq9) {
            return "auto," + ((bq9) gq9Var).b;
        }
        if (gq9Var.equals(cq9.b)) {
            return "disabled";
        }
        if (gq9Var instanceof eq9) {
            eq9 eq9Var = (eq9) gq9Var;
            kt4 kt4Var = kt4.MINUTES;
            return rh4.h("schedule,", (int) ote.f(ft4.i(eq9Var.b, kt4Var), -2147483648L, 2147483647L), (int) ote.f(ft4.i(eq9Var.c, kt4Var), -2147483648L, 2147483647L), ",");
        }
        if (gq9Var.equals(fq9.b)) {
            return "system";
        }
        if (gq9Var.equals(dq9.b)) {
            return "enabled";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.ofc
    public void accept(Object obj, Object obj2) {
        pe5 pe5Var;
        qne qneVar = (qne) obj2;
        bhg bhgVar = (bhg) obj;
        yd7 yd7Var = new yd7(Long.MAX_VALUE, 0, false, null);
        pe5[] pe5VarArrH = bhgVar.h();
        pe5 pe5Var2 = null;
        if (pe5VarArrH != null) {
            int i = 0;
            while (true) {
                if (i >= pe5VarArrH.length) {
                    pe5Var = null;
                    break;
                }
                pe5Var = pe5VarArrH[i];
                if ("location_updates_with_callback".equals(pe5Var.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (pe5Var != null && pe5Var.b() >= 1) {
                nkg nkgVar = (nkg) bhgVar.o();
                khg khgVar = new khg(4, null, new xgg(1, qneVar), null, null);
                Parcel parcelG0 = nkgVar.G0();
                zfg.b(parcelG0, yd7Var);
                zfg.b(parcelG0, khgVar);
                nkgVar.H0(parcelG0, 90);
                return;
            }
        }
        pe5[] pe5VarArrH2 = bhgVar.h();
        if (pe5VarArrH2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= pe5VarArrH2.length) {
                    break;
                }
                pe5 pe5Var3 = pe5VarArrH2[i2];
                if ("get_last_location_with_request".equals(pe5Var3.a)) {
                    pe5Var2 = pe5Var3;
                    break;
                }
                i2++;
            }
            if (pe5Var2 != null && pe5Var2.b() >= 1) {
                nkg nkgVar2 = (nkg) bhgVar.o();
                xgg xggVar = new xgg(1, qneVar);
                Parcel parcelG02 = nkgVar2.G0();
                zfg.b(parcelG02, yd7Var);
                parcelG02.writeStrongBinder(xggVar);
                nkgVar2.H0(parcelG02, 82);
                return;
            }
        }
        nkg nkgVar3 = (nkg) bhgVar.o();
        Parcel parcelG03 = nkgVar3.G0();
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                nkgVar3.d.transact(7, parcelG03, parcelObtain, 0);
                parcelObtain.readException();
                parcelG03.recycle();
                Location location = (Location) zfg.a(parcelObtain, Location.CREATOR);
                parcelObtain.recycle();
                qneVar.b(location);
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelG03.recycle();
            throw th;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return ((OneMeRoomDatabase) obj).v();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // defpackage.yoe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(int r6, java.lang.CharSequence r7) {
        /*
            r5 = this;
            r5 = 1
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L5:
            if (r2 >= r6) goto L23
            if (r3 != r1) goto L23
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            zoe r4 = defpackage.bpe.a
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1e
            if (r3 == r1) goto L1e
            switch(r3) {
                case 14: goto L20;
                case 15: goto L20;
                case 16: goto L1e;
                case 17: goto L1e;
                default: goto L1c;
            }
        L1c:
            r3 = r1
            goto L21
        L1e:
            r3 = r0
            goto L21
        L20:
            r3 = r5
        L21:
            int r2 = r2 + r5
            goto L5
        L23:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb9.b(int, java.lang.CharSequence):int");
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(kh7.class, Executor.class)));
    }

    @Override // defpackage.q78
    public s78 i(o78 o78Var) {
        MediaCodec mediaCodecA = null;
        try {
            mediaCodecA = a(o78Var);
            Trace.beginSection("configureCodec");
            mediaCodecA.configure(o78Var.b, o78Var.d, o78Var.e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecA.start();
            Trace.endSection();
            adb adbVar = new adb();
            adbVar.a = mediaCodecA;
            if (oaf.a < 21) {
                adbVar.b = mediaCodecA.getInputBuffers();
                adbVar.c = mediaCodecA.getOutputBuffers();
            }
            return adbVar;
        } catch (IOException | RuntimeException e) {
            if (mediaCodecA != null) {
                mediaCodecA.release();
            }
            throw e;
        }
    }

    @Override // defpackage.df9
    public Object r(gy8 gy8Var) {
        lk lkVar = new lk();
        lkVar.c = "";
        int iN = lz7.N(gy8Var);
        for (int i = 0; i < iN; i++) {
            String strP = lz7.P(gy8Var);
            strP.getClass();
            switch (strP) {
                case "description":
                    lkVar.c = lz7.P(gy8Var);
                    break;
                case "name":
                    lkVar.b = lz7.P(gy8Var);
                    break;
                case "botId":
                    lkVar.a = lz7.M(gy8Var, 0L);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new bq0(lkVar);
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return true;
    }
}
