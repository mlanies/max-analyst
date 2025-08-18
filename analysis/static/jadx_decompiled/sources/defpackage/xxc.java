package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xxc implements b66, s43, kz3, ed6, wn0, kxd {
    public static final xxc a = new xxc();
    public static final ci b = new ci();
    public static final /* synthetic */ xxc c = new xxc();
    public static final we1 o = new we1(25);
    public static final xxc X = new xxc();
    public static final xxc Y = new xxc();
    public static final xxc Z = new xxc();

    public static void g(HttpURLConnection httpURLConnection) throws UnknownHostException {
        try {
            httpURLConnection.connect();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (SecurityException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                throw e3;
            }
            String name = cause.getClass().getName();
            if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                throw e3;
            }
            throw new UnknownHostException();
        }
    }

    public static LinearLayout i(Context context, List list, m56 m56Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tt3 tt3Var = (tt3) it.next();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnClickListener(new tb(m56Var, 25, tt3Var));
            Integer num = tt3Var.d;
            pq9 pq9Var = qp4.u0;
            Continuation continuation = null;
            if (num != null) {
                int iIntValue = num.intValue();
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setImageResource(iIntValue);
                Integer num2 = tt3Var.e;
                if (num2 != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).c(num2.intValue())));
                }
                float f = 24;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388627;
                layoutParams.setMarginStart(tu0.G(4 * fk4.d().getDisplayMetrics().density));
                frameLayout.addView(imageView, layoutParams);
                v3c.y(new c3(tt3Var, imageView, continuation, 10), frameLayout);
            }
            TextView textView = new TextView(frameLayout.getContext());
            i4f.l.b(textView, du4.b);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(pq9Var.j(textView).getText().e);
            textView.setText(tt3Var.b.b(textView.getContext()));
            Integer num3 = tt3Var.c;
            if (num3 != null) {
                textView.setTextColor(pq9Var.j(textView).c(num3.intValue()));
            }
            v3c.y(new xh0(tt3Var, continuation, 7), textView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(tu0.G((tt3Var.d != null ? 44 : 4) * fk4.d().getDisplayMetrics().density));
            layoutParams2.setMarginEnd(tu0.G(4 * fk4.d().getDisplayMetrics().density));
            float f2 = 12;
            layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams2.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams2);
            linearLayout.addView(frameLayout, -1, -2);
        }
        return linearLayout;
    }

    public static rq6 k(a8g a8gVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) a8gVar.b).openConnection();
        Iterator it = ((zs) a8gVar.c).iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                try {
                    break;
                } catch (IOException e) {
                    httpURLConnection.disconnect();
                    throw e;
                }
            }
            lq6 lq6Var = (lq6) u1Var.next();
            httpURLConnection.setRequestProperty(lq6Var.a, lq6Var.b);
        }
        httpURLConnection.setRequestMethod((String) a8gVar.a);
        pkg pkgVar = (pkg) a8gVar.o;
        if (pkgVar != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setChunkedStreamingMode(0);
        }
        g(httpURLConnection);
        if (pkgVar != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            try {
                fl flVar = (fl) pkgVar.a;
                boolean zShouldGzip = flVar.shouldGzip();
                int i = pkgVar.b;
                wk wkVar = (wk) pkgVar.c;
                up6 up6Var = (up6) pkgVar.o;
                if (zShouldGzip) {
                    tp6 tp6Var = new tp6(bufferedOutputStream);
                    up6Var.b.f(tp6Var, flVar, wkVar, i);
                    tp6Var.finish();
                    tp6Var.m();
                } else {
                    up6Var.b.f(bufferedOutputStream, flVar, wkVar, i);
                }
                bufferedOutputStream.close();
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        }
        ArrayList arrayList = new ArrayList();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            for (String str : httpURLConnection.getHeaderFields().keySet()) {
                if (str != null) {
                    arrayList.add(new lq6(str, httpURLConnection.getHeaderField(str)));
                }
            }
            return new rq6(responseCode, new zs(1, (lq6[]) arrayList.toArray(new lq6[0])), new k36(2, httpURLConnection), 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new IOException(e2);
        }
    }

    public static mg4 l(xxc xxcVar, Integer num) {
        mg4 mg4Var;
        mg4 mg4Var2 = mg4.REGULAR;
        xxcVar.getClass();
        byte bByteValue = num.byteValue();
        mg4[] mg4VarArrValues = mg4.values();
        int length = mg4VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mg4Var = null;
                break;
            }
            mg4Var = mg4VarArrValues[i];
            if (mg4Var.a == bByteValue) {
                break;
            }
            i++;
        }
        return mg4Var == null ? mg4Var2 : mg4Var;
    }

    public static String m(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                printWriter.flush();
                String str = "\n" + w9e.b1(stringWriter.toString()).toString();
                v3c.i(printWriter, null);
                return str;
            } finally {
            }
        } catch (Throwable unused) {
            return "\ncould not get stacktrace from error: " + th;
        }
    }

    @Override // defpackage.wn0
    public boolean a(int i) {
        return false;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? m28.a : f28.e(list);
    }

    @Override // defpackage.wn0
    public o43 b() {
        return null;
    }

    @Override // defpackage.wn0
    public void c(int i, o43 o43Var) {
    }

    @Override // defpackage.wn0
    public void clear() {
    }

    @Override // defpackage.wn0
    public void d(int i, o43 o43Var) {
    }

    @Override // defpackage.wn0
    public o43 e() {
        return null;
    }

    @Override // defpackage.wn0
    public o43 f(int i) {
        return null;
    }

    @Override // defpackage.kxd
    public long j(long j) {
        return j;
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) {
        int iN;
        String strP;
        if (!gy8Var.m()) {
            return null;
        }
        try {
            iN = lz7.N(gy8Var);
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
            iN = 0;
        }
        Long lValueOf = null;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("timestamp")) {
                    long jM = 0;
                    try {
                        jM = lz7.M(gy8Var, 0L);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                    lValueOf = Long.valueOf(jM);
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new fgc(lValueOf);
    }
}
