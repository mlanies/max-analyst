package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import org.apache.http.HttpHost;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class fp3 {
    public static ExecutorService b;
    public static final Object a = new Object();
    public static final ou6 c = new ou6("drawable", ".drawable");
    public static final nde d = new nde();

    public static final void D(CharSequence charSequence) {
        Object[] spans = null;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            try {
                spans = spannable.getSpans(0, spannable.length(), sj.class);
            } catch (Throwable unused) {
            }
            sj[] sjVarArr = (sj[]) spans;
            if (sjVarArr != null) {
                for (sj sjVar : sjVarArr) {
                    kp.w(spannable, c4f.class, spannable.getSpanStart(sjVar), spannable.getSpanEnd(sjVar));
                }
            }
        }
    }

    public static final Object E(pue pueVar, a66 a66Var) throws Throwable {
        Object lb3Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        pag.q(pueVar, true, new gm4(0, j47.H(pueVar.uCont.getContext()).invokeOnTimeout(pueVar.a, pueVar, pueVar.getContext())));
        try {
            if (a66Var instanceof gi0) {
                f8.c(2, a66Var);
                lb3Var = a66Var.invoke(pueVar, pueVar);
            } else {
                lb3Var = v3c.H(a66Var, pueVar, pueVar);
            }
        } catch (Throwable th) {
            lb3Var = new lb3(th, false);
        }
        tx3 tx3Var = tx3.a;
        if (lb3Var == tx3Var || (objMakeCompletingOnce$kotlinx_coroutines_core = pueVar.makeCompletingOnce$kotlinx_coroutines_core(lb3Var)) == a97.b) {
            return tx3Var;
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof lb3) {
            Throwable th2 = ((lb3) objMakeCompletingOnce$kotlinx_coroutines_core).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).a != pueVar) {
                throw th2;
            }
            if (lb3Var instanceof lb3) {
                throw ((lb3) lb3Var).a;
            }
        } else {
            lb3Var = a97.a(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return lb3Var;
    }

    public static String F(l20 l20Var) {
        int i = 5;
        while (true) {
            g20 g20Var = l20Var.a;
            int i2 = g20Var == null ? -1 : ykd.$EnumSwitchMapping$0[g20Var.ordinal()];
            if (i2 == 1) {
                return l20Var.b.a();
            }
            if (i2 == 2) {
                return l20Var.d.d;
            }
            if (i2 != 3) {
                return null;
            }
            c20 c20Var = l20Var.g;
            x10 x10Var = c20Var.f;
            if (x10Var != null) {
                if (x10Var != null) {
                    return x10Var.a();
                }
                return null;
            }
            if (!c20Var.a() || i < 0 || (l20Var = c20Var.g) == null) {
                return null;
            }
            i--;
        }
    }

    public static final g9g G(ja7 ja7Var, r6d r6dVar) {
        pag pagVarE = r6dVar.e();
        if (pagVarE instanceof k5b) {
            return g9g.Y;
        }
        if (tpa.f(pagVarE, nae.f)) {
            return g9g.o;
        }
        if (!tpa.f(pagVarE, nae.g)) {
            return g9g.c;
        }
        r6d r6dVarF = f(r6dVar.i(0), ja7Var.b);
        pag pagVarE2 = r6dVarF.e();
        if ((pagVarE2 instanceof x8b) || tpa.f(pagVarE2, w6d.f)) {
            return g9g.X;
        }
        if (ja7Var.a.d) {
            return g9g.o;
        }
        throw xfg.a(r6dVarF);
    }

    public static final Object H(long j, a66 a66Var, Continuation continuation) {
        if (j > 0) {
            return E(new pue(j, continuation), a66Var);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(long r7, defpackage.a66 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.que
            if (r0 == 0) goto L13
            r0 = r10
            que r0 = (defpackage.que) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            que r0 = new que
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            mec r7 = r0.o
            defpackage.od2.a0(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2a
            goto L58
        L2a:
            r8 = move-exception
            goto L5b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.od2.a0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            mec r10 = new mec
            r10.<init>()
            r0.getClass()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            r0.o = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            r0.Y = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            pue r2 = new pue     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            r10.a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            java.lang.Object r10 = E(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            if (r10 != r1) goto L58
            return r1
        L58:
            return r10
        L59:
            r8 = move-exception
            r7 = r10
        L5b:
            x77 r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L62
            return r3
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp3.I(long, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void c(Spannable spannable, ArrayList arrayList, fj fjVar) {
        ((ci) fjVar.a.get()).getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public static final Uri d(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (eae.o0(str, "file:", true) || eae.o0(str, HttpHost.DEFAULT_SCHEME_NAME, true) || eae.o0(str, "content", true) || eae.o0(str, "android.resource", true) || eae.o0(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }

    public static final void e(qnf qnfVar, mm mmVar, gh7 gh7Var) {
        dsc dscVar = (dsc) qnfVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (dscVar == null || dscVar.c) {
            return;
        }
        dscVar.a(mmVar, gh7Var);
        fg7 fg7Var = gh7Var.d;
        if (fg7Var == fg7.b || fg7Var.a(fg7.o)) {
            mmVar.g();
        } else {
            gh7Var.a(new bc4(gh7Var, 3, mmVar));
        }
    }

    public static final r6d f(r6d r6dVar, oz7 oz7Var) {
        if (!tpa.f(r6dVar.e(), w6d.e)) {
            return r6dVar.isInline() ? f(r6dVar.i(0), oz7Var) : r6dVar;
        }
        j47.F(r6dVar);
        return r6dVar;
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void i(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(k7d.j("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void j(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void l() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void m(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static dj3 q(ConstraintLayout constraintLayout) {
        dj3 dj3Var = new dj3();
        dj3Var.c(constraintLayout);
        return dj3Var;
    }

    public static void r(long j, yaf yafVar, xze[] xzeVarArr) {
        int i;
        while (true) {
            if (yafVar.c() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (yafVar.c() == 0) {
                    i = -1;
                    break;
                }
                int iV = yafVar.v();
                i2 += iV;
                if (iV != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (yafVar.c() == 0) {
                    i3 = -1;
                    break;
                }
                int iV2 = yafVar.v();
                i3 += iV2;
                if (iV2 != 255) {
                    break;
                }
            }
            int i4 = yafVar.b + i3;
            if (i3 == -1 || i3 > yafVar.c()) {
                i4 = yafVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iV3 = yafVar.v();
                int iA = yafVar.A();
                int iH = iA == 49 ? yafVar.h() : 0;
                int iV4 = yafVar.v();
                if (iA == 47) {
                    yafVar.I(1);
                }
                boolean z = iV3 == 181 && (iA == 49 || iA == 47) && iV4 == 3;
                if (iA == 49) {
                    z &= iH == 1195456820;
                }
                if (z) {
                    s(j, yafVar, xzeVarArr);
                }
            }
            yafVar.H(i4);
        }
    }

    public static void s(long j, yaf yafVar, xze[] xzeVarArr) {
        int iV = yafVar.v();
        if ((iV & 64) != 0) {
            yafVar.I(1);
            int i = (iV & 31) * 3;
            int i2 = yafVar.b;
            for (xze xzeVar : xzeVarArr) {
                yafVar.H(i2);
                xzeVar.c(i, yafVar);
                if (j != -9223372036854775807L) {
                    xzeVar.b(j, 1, i, 0, null);
                }
            }
        }
    }

    public static final boolean t(int i, Set set) {
        String str;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            switch (i) {
                case 1:
                    str = "MESSAGE_NORMAL_TEXT";
                    break;
                case 2:
                    str = "MESSAGE_BIG_EMOJI_TEXT";
                    break;
                case 3:
                    str = "MESSAGE_INPUT";
                    break;
                case 4:
                    str = "STICKERS_KEYBOARD";
                    break;
                case 5:
                    str = "CHATS_LIST";
                    break;
                case 6:
                    str = "REACTION_SELECT_PANEL";
                    break;
                case 7:
                    str = "REACTION_BADGE";
                    break;
                default:
                    throw null;
            }
            if (eae.i0(str, charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static final hlc u(Context context, String str, Class cls) {
        if (true ^ (str == null || w9e.C0(str))) {
            return new hlc(context, str, cls);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.on5 r7, defpackage.p8c r8, boolean r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.ro5
            if (r0 == 0) goto L13
            r0 = r10
            ro5 r0 = (defpackage.ro5) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            ro5 r0 = new ro5
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.Z
            tt0 r7 = r0.Y
            p8c r8 = r0.X
            on5 r2 = r0.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.Z
            tt0 r7 = r0.Y
            p8c r8 = r0.X
            on5 r2 = r0.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            defpackage.od2.a0(r10)
            boolean r10 = r7 instanceof defpackage.jte
            if (r10 != 0) goto Lab
            tt0 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.o = r7     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r10     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.t0 = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.o = r2     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r7     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.t0 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.cancel(r3)
        L8d:
            e5f r7 = defpackage.e5f.a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.cancel(r3)
        Laa:
            throw r10
        Lab:
            jte r7 = (defpackage.jte) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp3.v(on5, p8c, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Integer w(int i, h23 h23Var) {
        if (h23Var.equals(nec.a(sf7.class))) {
            return Integer.valueOf(yoc.q0);
        }
        if (h23Var.equals(nec.a(xc.class))) {
            return Integer.valueOf(yoc.p0);
        }
        if (h23Var.equals(nec.a(kq9.class))) {
            return Integer.valueOf(yoc.r0);
        }
        if (!h23Var.equals(nec.a(kz4.class))) {
            throw new IllegalStateException("Such validation rule (" + nec.a(h23.class) + " is not implemented");
        }
        int iS = au1.s(i);
        if (iS == 0) {
            return Integer.valueOf(yoc.n0);
        }
        if (iS == 1) {
            return null;
        }
        if (iS == 2) {
            return Integer.valueOf(yoc.o0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float x(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static Bitmap y(Context context, int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = bga.a;
                break;
            case 1:
                i2 = bga.b;
                break;
            case 2:
                i2 = bga.m;
                break;
            case 3:
                i2 = bga.s;
                break;
            case 4:
                i2 = bga.t;
                break;
            case 5:
                i2 = bga.u;
                break;
            case 6:
                i2 = bga.v;
                break;
            case 7:
                i2 = bga.w;
                break;
            case 8:
                i2 = bga.x;
                break;
            case 9:
                i2 = bga.y;
                break;
            case 10:
                i2 = bga.c;
                break;
            case 11:
                i2 = bga.d;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                i2 = bga.e;
                break;
            case 13:
                i2 = bga.f;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                i2 = bga.g;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                i2 = bga.h;
                break;
            case 16:
                i2 = bga.i;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                i2 = bga.j;
                break;
            case 18:
                i2 = bga.k;
                break;
            case 19:
                i2 = bga.l;
                break;
            case 20:
                i2 = bga.n;
                break;
            case 21:
                i2 = bga.o;
                break;
            case 22:
                i2 = bga.p;
                break;
            case 23:
                i2 = bga.q;
                break;
            default:
                i2 = bga.r;
                break;
        }
        Drawable drawableN = s36.n(context, i2);
        if (drawableN instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableN).getBitmap();
        }
        return null;
    }

    public static e8b z(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        qo9 qo9Var = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            xo9 xo9Var = (xo9) it.next();
            linkedHashMap.put(Integer.valueOf(i), xo9Var.a);
            for (po9 po9Var : xo9Var.b) {
                Boolean bool = po9Var.c;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                qo9 qo9Var2 = new qo9(po9Var.a, po9Var.b, i, zBooleanValue);
                arrayList.add(qo9Var2);
                if (zBooleanValue && qo9Var == null) {
                    qo9Var = qo9Var2;
                }
            }
            i = i2;
        }
        return new e8b(linkedHashMap, arrayList, qo9Var);
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }
}
