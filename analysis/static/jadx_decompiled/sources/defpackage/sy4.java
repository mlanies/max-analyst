package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class sy4 implements lv, o11, ia, dn2, n43, ys3, co7, nq8, pic, qj3, Provider, mq1, g8b, zde {
    public static final fs4 c = new fs4(20);
    public static final yw2 o = new yw2(new yw2(new ba3(new fs4(22), 0), 1), 2);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ sy4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static boolean D(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static qy3 L(File file) throws Exception {
        try {
            String name = file.getName();
            int iE0 = w9e.E0(name, '_', 0, 6);
            if (iE0 < 0) {
                throw new IllegalStateException("Malformed directory name ".concat(name).toString());
            }
            int iO = z7b.o(name.substring(0, iE0));
            long j = Long.parseLong(name.substring(iE0 + 1));
            File fileJ = lk5.J(file, "system_info");
            if (!fileJ.exists()) {
                throw new IllegalStateException("No system info file".toString());
            }
            File fileJ2 = lk5.J(file, "stacktrace");
            if (!fileJ2.exists()) {
                throw new IllegalStateException("No stacktrace file".toString());
            }
            return new qy3(j, iO, file.getPath(), fileJ.getPath(), lk5.J(file, "tags").getPath(), fileJ2.getPath(), lk5.J(file, "all_stacktraces").getPath(), lk5.J(file, "all_logs").getPath());
        } catch (Exception e) {
            lk5.F(file);
            throw e;
        }
    }

    public static void R(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public int A() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public String B(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void C(int i, long j) throws ParserException {
        c28 c28Var = (c28) this.b;
        c28Var.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw ParserException.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw ParserException.a(null, sb2.toString());
        }
        int i2 = 3;
        switch (i) {
            case 131:
                c28Var.b(i);
                c28Var.u.d = (int) j;
                return;
            case 136:
                c28Var.b(i);
                c28Var.u.V = j == 1;
                return;
            case 155:
                c28Var.I = c28Var.k(j);
                return;
            case 159:
                c28Var.b(i);
                c28Var.u.O = (int) j;
                return;
            case 176:
                c28Var.b(i);
                c28Var.u.m = (int) j;
                return;
            case 179:
                c28Var.a(i);
                c28Var.C.a(c28Var.k(j));
                return;
            case 186:
                c28Var.b(i);
                c28Var.u.n = (int) j;
                return;
            case 215:
                c28Var.b(i);
                c28Var.u.c = (int) j;
                return;
            case 231:
                c28Var.B = c28Var.k(j);
                return;
            case 238:
                c28Var.P = (int) j;
                return;
            case 241:
                if (c28Var.E) {
                    return;
                }
                c28Var.a(i);
                c28Var.D.a(j);
                c28Var.E = true;
                return;
            case 251:
                c28Var.Q = true;
                return;
            case 16871:
                c28Var.b(i);
                c28Var.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw ParserException.a(null, sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw ParserException.a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw ParserException.a(null, sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ParserException.a(null, sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw ParserException.a(null, sb7.toString());
            case 21420:
                c28Var.x = j + c28Var.q;
                return;
            case 21432:
                int i3 = (int) j;
                c28Var.b(i);
                if (i3 == 0) {
                    c28Var.u.w = 0;
                    return;
                }
                if (i3 == 1) {
                    c28Var.u.w = 2;
                    return;
                } else if (i3 == 3) {
                    c28Var.u.w = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    c28Var.u.w = 3;
                    return;
                }
            case 21680:
                c28Var.b(i);
                c28Var.u.o = (int) j;
                return;
            case 21682:
                c28Var.b(i);
                c28Var.u.q = (int) j;
                return;
            case 21690:
                c28Var.b(i);
                c28Var.u.p = (int) j;
                return;
            case 21930:
                c28Var.b(i);
                c28Var.u.U = j == 1;
                return;
            case 21998:
                c28Var.b(i);
                c28Var.u.f = (int) j;
                return;
            case 22186:
                c28Var.b(i);
                c28Var.u.R = j;
                return;
            case 22203:
                c28Var.b(i);
                c28Var.u.S = j;
                return;
            case 25188:
                c28Var.b(i);
                c28Var.u.P = (int) j;
                return;
            case 30321:
                c28Var.b(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    c28Var.u.r = 0;
                    return;
                }
                if (i4 == 1) {
                    c28Var.u.r = 1;
                    return;
                } else if (i4 == 2) {
                    c28Var.u.r = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    c28Var.u.r = 3;
                    return;
                }
            case 2352003:
                c28Var.b(i);
                c28Var.u.e = (int) j;
                return;
            case 2807729:
                c28Var.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c28Var.b(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            c28Var.u.A = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            c28Var.u.A = 1;
                            return;
                        }
                    case 21946:
                        c28Var.b(i);
                        int i6 = (int) j;
                        if (i6 != 1) {
                            if (i6 == 16) {
                                i2 = 6;
                            } else if (i6 == 18) {
                                i2 = 7;
                            } else if (i6 != 6 && i6 != 7) {
                                i2 = -1;
                            }
                        }
                        if (i2 != -1) {
                            c28Var.u.z = i2;
                            return;
                        }
                        return;
                    case 21947:
                        c28Var.b(i);
                        c28Var.u.x = true;
                        int iA = h63.a((int) j);
                        if (iA != -1) {
                            c28Var.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        c28Var.b(i);
                        c28Var.u.B = (int) j;
                        return;
                    case 21949:
                        c28Var.b(i);
                        c28Var.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void E(fs8 fs8Var) {
        String str = fs8Var.Z;
        hm9.m("sy4", "got broken message element, text: %s, elements: %s", Integer.valueOf(str != null ? str.length() : 0), fs8Var.C0);
        ((ad) this.b).f("MENTION_BROKEN_RANGE");
    }

    public void F() {
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        h21 h21VarN0 = ((CallBottomPanelWidget) this.b).n0();
        ir1 ir1VarR = h21VarN0.r();
        lvc lvcVar = ir1VarR.i;
        lvcVar.getClass();
        kvc kvcVar = ((wvc) ((vvc) lvcVar).t0.getValue()).b;
        boolean zF = tpa.f(kvcVar != null ? kvcVar.c : null, ((cra) ir1VarR.d).c().a.getId());
        el1 el1Var = h21VarN0.c;
        if (zF) {
            pnf.o(el1Var.M0, fj1.D);
        } else {
            pnf.o(el1Var.M0, aj1.D);
        }
    }

    public void G(View view) {
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.b;
        if (!((el1) callBottomPanelWidget.c.getValue()).u()) {
            if (callBottomPanelWidget.n0().t()) {
                callBottomPanelWidget.m0().e(callBottomPanelWidget.n0().q());
            }
        } else if (callBottomPanelWidget.n0().t()) {
            qt3 qt3VarS = dy7.c(1).y().Y(view).s();
            ArrayList arrayListQ = callBottomPanelWidget.n0().q();
            ArrayList arrayList = new ArrayList(z53.S(arrayListQ, 10));
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                a51 a51Var = (a51) it.next();
                arrayList.add(new tt3(a51Var.getId(), a51Var.getTitle(), Integer.valueOf(wfa.W), Integer.valueOf(a51Var.getIcon()), Integer.valueOf(wfa.Q)));
            }
            rt3 rt3VarBuild = qt3VarS.I(arrayList).build();
            callBottomPanelWidget.Y = rt3VarBuild;
            rt3VarBuild.q(callBottomPanelWidget);
        }
    }

    public void H() {
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        pnf.o(((CallBottomPanelWidget) this.b).n0().c.M0, hj1.D);
    }

    public void I(boolean z) {
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        pnf.o(((CallBottomPanelWidget) this.b).n0().c.M0, new rj1(z));
    }

    public Bundle J() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public e99 K(ra4 ra4Var, xs6 xs6Var) {
        yaf yafVar = (yaf) this.b;
        e99 e99VarU0 = null;
        int i = 0;
        while (true) {
            try {
                ra4Var.q(yafVar.a, 0, 10, false);
                yafVar.H(0);
                if (yafVar.x() != 4801587) {
                    break;
                }
                yafVar.I(3);
                int iU = yafVar.u();
                int i2 = iU + 10;
                if (e99VarU0 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(yafVar.a, 0, bArr, 0, 10);
                    ra4Var.q(bArr, 10, iU, false);
                    e99VarU0 = new at6(xs6Var).u0(i2, bArr);
                } else {
                    ra4Var.b(iU, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ra4Var.Y = 0;
        ra4Var.b(i, false);
        return e99VarU0;
    }

    public void M(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public qy3 N(int i, Throwable th, yie yieVar, List list, Map map, List list2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, a52.a), 8192);
        try {
            ju0.f(th, bufferedWriter);
            v3c.i(bufferedWriter, null);
            return O(i, byteArrayOutputStream.toByteArray(), yieVar, list, map, list2);
        } finally {
        }
    }

    public qy3 O(int i, byte[] bArr, yie yieVar, List list, Map map, List list2) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strQ = c37.q();
        Context context = (Context) this.b;
        File fileJ = lk5.J(new File(context.getCacheDir(), strQ.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(strQ.replace(':', '-'))), "crashes");
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str = "CRASH";
                break;
            case 2:
                str = "NON_FATAL";
                break;
            case 3:
                str = "FATAL";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "WARNING";
                break;
            case 6:
                str = "NOTICE";
                break;
            case 7:
                str = "INFO";
                break;
            case 8:
                str = "DEBUG";
                break;
            case 9:
                str = "MINIDUMP";
                break;
            case 10:
                str = "ANR";
                break;
            default:
                throw null;
        }
        sb.append(str);
        sb.append('_');
        sb.append(jCurrentTimeMillis);
        File fileJ2 = lk5.J(fileJ, sb.toString());
        if (fileJ2.exists()) {
            fileJ2.getName();
            return null;
        }
        try {
            m6d.y(fileJ2);
            File fileJ3 = lk5.J(fileJ2, "stacktrace");
            FileOutputStream fileOutputStream = new FileOutputStream(fileJ3);
            try {
                fileOutputStream.write(bArr);
                v3c.i(fileOutputStream, null);
                File fileJ4 = lk5.J(fileJ2, "system_info");
                lk5.K(fileJ4, j47.q0(yieVar).toString());
                File fileJ5 = lk5.J(fileJ2, "tags");
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    lk5.K(fileJ5, jSONArray.toString());
                }
                File fileJ6 = lk5.J(fileJ2, "all_stacktraces");
                int i2 = 0;
                if (!map.isEmpty()) {
                    TreeMap treeMap = new TreeMap(c);
                    treeMap.putAll(map);
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileJ6), a52.a), 8192));
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            Thread thread = (Thread) entry.getKey();
                            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                            printWriter.append((CharSequence) "Thread: ").append((CharSequence) thread.getName()).append((CharSequence) " (").append((CharSequence) thread.getState().toString()).append((CharSequence) ")");
                            printWriter.append('\n');
                            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                                ju0.h(stackTraceElement, printWriter, 0, 6);
                            }
                        }
                        v3c.i(printWriter, null);
                    } finally {
                    }
                }
                File fileJ7 = lk5.J(fileJ2, "all_logs");
                if (!list2.isEmpty()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileJ7), 8192);
                    try {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i3 = i2 + 1;
                            ((ns7) it2.next()).a(bufferedOutputStream, i2);
                            i2 = i3;
                        }
                        v3c.i(bufferedOutputStream, null);
                    } finally {
                    }
                }
                return new qy3(jCurrentTimeMillis, i, fileJ2.getPath(), fileJ4.getPath(), fileJ5.getPath(), fileJ3.getPath(), fileJ6.getPath(), fileJ7.getPath());
            } finally {
            }
        } catch (IOException unused) {
            lk5.F(fileJ2);
            return null;
        }
    }

    public boolean Q(List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((jxd) it.next()).c));
        }
        Set setH0 = x53.H0(arrayList);
        boolean z = !setH0.equals((Set) this.b);
        this.b = setH0;
        return z;
    }

    @Override // defpackage.zde
    public void S(yde ydeVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g8b
    public void a(see seeVar) {
        wee weeVar;
        if (!kq0.t()) {
            ot3.a(((q8b) this.b).getContext()).execute(new do9(this, 16, seeVar));
            return;
        }
        ax1 ax1Var = seeVar.e;
        ((q8b) this.b).y0 = ax1Var.p();
        r8b r8bVar = ((q8b) this.b).w0;
        Rect rectE = ax1Var.g().e();
        r8bVar.getClass();
        r8bVar.a = new Rational(rectE.width(), rectE.height());
        synchronized (r8bVar) {
            r8bVar.c = rectE;
        }
        seeVar.c(ot3.a(((q8b) this.b).getContext()), new u00(this, ax1Var, seeVar, 23));
        q8b q8bVar = (q8b) this.b;
        pu9 pu9Var = q8bVar.b;
        n8b n8bVar = q8bVar.a;
        if (!(pu9Var instanceof wee) || q8b.c(seeVar, n8bVar)) {
            q8b q8bVar2 = (q8b) this.b;
            if (q8b.c(seeVar, q8bVar2.a)) {
                q8b q8bVar3 = (q8b) this.b;
                hre hreVar = new hre(q8bVar3, q8bVar3.o);
                hreVar.i = false;
                hreVar.k = new AtomicReference();
                weeVar = hreVar;
            } else {
                q8b q8bVar4 = (q8b) this.b;
                weeVar = new wee(q8bVar4, q8bVar4.o);
            }
            q8bVar2.b = weeVar;
        }
        yw1 yw1VarP = ax1Var.p();
        q8b q8bVar5 = (q8b) this.b;
        k8b k8bVar = new k8b(yw1VarP, q8bVar5.t0, q8bVar5.b);
        ((q8b) this.b).u0.set(k8bVar);
        ax1Var.f().f(ot3.a(((q8b) this.b).getContext()), k8bVar);
        ((q8b) this.b).b.l(seeVar, new u00(this, k8bVar, ax1Var, 24));
        q8b q8bVar6 = (q8b) this.b;
        if (q8bVar6.indexOfChild(q8bVar6.c) == -1) {
            q8b q8bVar7 = (q8b) this.b;
            q8bVar7.addView(q8bVar7.c);
        }
        ((q8b) this.b).getClass();
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 16:
                Objects.requireNonNull(obj, "value is null");
                ((qj3) this.b).accept(new bt9(obj));
                break;
            case 22:
                List<fs8> list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    for (fs8 fs8Var : list) {
                        List list2 = fs8Var.C0;
                        if (list2 != null && !list2.isEmpty()) {
                            String str = fs8Var.Z;
                            if (str == null || str.length() == 0) {
                                E(fs8Var);
                            } else {
                                for (lu8 lu8Var : fs8Var.C0) {
                                    short s = lu8Var.o;
                                    if (s < 0 || s + lu8Var.X > str.length()) {
                                        E(fs8Var);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                hm9.p(((s8d) this.b).X, "onSuccess", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.ys3
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.ys3
    public bt3 build() {
        return new bt3(new wd6(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.ia
    public void c(gg1 gg1Var, boolean z) {
        bc7[] bc7VarArr = CallOpponentsListWidget.H0;
        ((yz0) ((ez0) ((CallOpponentsListWidget) this.b).r0().t0.getValue())).c(gg1Var, z);
    }

    @Override // defpackage.ys3
    public void d(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    @Override // defpackage.pic
    public void e(Object obj) {
        ((wm5) this.b).b.e((byte[]) obj);
    }

    @Override // defpackage.n43
    public void f() {
        ((yxc) this.b).getClass();
    }

    @Override // defpackage.ia
    public void g() {
        je1 je1Var = je1.c;
        je1Var.getClass();
        je1Var.P1().b(":call-admin-waiting-room", null);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.b;
    }

    @Override // defpackage.nq8
    public void h(Object obj) {
        ((pq9) this.b).getClass();
    }

    @Override // defpackage.lv
    public e5f h0(long j, List list) {
        boolean zIsEmpty = list.isEmpty();
        e5f e5fVar = e5f.a;
        if (zIsEmpty) {
            return e5fVar;
        }
        ((bx) this.b).B();
        ((bx) this.b).o(j, list, false, true);
        return e5fVar;
    }

    @Override // defpackage.nq8
    public void i(Object obj) {
        ((pq9) this.b).getClass();
    }

    public void j(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (((ArrayList) this.b) == null) {
                this.b = new ArrayList();
            }
            if (!((ArrayList) this.b).contains(str)) {
                ((ArrayList) this.b).add(str);
            }
        }
    }

    public void k(da9... da9VarArr) {
        for (da9 da9Var : da9VarArr) {
            int i = da9Var.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i2 = da9Var.b;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                da9Var.toString();
            }
            treeMap2.put(Integer.valueOf(i2), da9Var);
        }
    }

    public void l(int i, int i2, ra4 ra4Var) throws ParserException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        c28 c28Var = (c28) this.b;
        SparseArray sparseArray = c28Var.c;
        int i7 = 4;
        int i8 = 0;
        int i9 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c28Var.G != 2) {
                    return;
                }
                a28 a28Var = (a28) sparseArray.get(c28Var.M);
                if (c28Var.P != 4 || !"V_VP9".equals(a28Var.b)) {
                    ra4Var.z(i2);
                    return;
                }
                yaf yafVar = c28Var.n;
                yafVar.E(i2);
                ra4Var.h(yafVar.a, 0, i2, false);
                return;
            }
            if (i == 16877) {
                c28Var.b(i);
                a28 a28Var2 = c28Var.u;
                int i10 = a28Var2.g;
                if (i10 != 1685485123 && i10 != 1685480259) {
                    ra4Var.z(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                a28Var2.N = bArr;
                ra4Var.h(bArr, 0, i2, false);
                return;
            }
            if (i == 16981) {
                c28Var.b(i);
                a28 a28Var3 = c28Var.u;
                byte[] bArr2 = new byte[i2];
                a28Var3.i = bArr2;
                ra4Var.h(bArr2, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                ra4Var.h(bArr3, 0, i2, false);
                c28Var.b(i);
                c28Var.u.j = new vze(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                yaf yafVar2 = c28Var.i;
                Arrays.fill(yafVar2.a, (byte) 0);
                ra4Var.h(yafVar2.a, 4 - i2, i2, false);
                yafVar2.H(0);
                c28Var.w = (int) yafVar2.w();
                return;
            }
            if (i == 25506) {
                c28Var.b(i);
                a28 a28Var4 = c28Var.u;
                byte[] bArr4 = new byte[i2];
                a28Var4.k = bArr4;
                ra4Var.h(bArr4, 0, i2, false);
                return;
            }
            if (i != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i);
                throw ParserException.a(null, sb.toString());
            }
            c28Var.b(i);
            a28 a28Var5 = c28Var.u;
            byte[] bArr5 = new byte[i2];
            a28Var5.v = bArr5;
            ra4Var.h(bArr5, 0, i2, false);
            return;
        }
        int i11 = c28Var.G;
        yaf yafVar3 = c28Var.g;
        if (i11 == 0) {
            yaf yafVar4 = c28Var.b;
            c28Var.M = (int) yafVar4.B(ra4Var, false, true, 8);
            c28Var.N = yafVar4.c;
            c28Var.I = -9223372036854775807L;
            c28Var.G = 1;
            yafVar3.E(0);
        }
        a28 a28Var6 = (a28) sparseArray.get(c28Var.M);
        if (a28Var6 == null) {
            ra4Var.z(i2 - c28Var.N);
            c28Var.G = 0;
            return;
        }
        a28Var6.X.getClass();
        if (c28Var.G == 1) {
            c28Var.f(ra4Var, 3);
            int i12 = (yafVar3.a[2] & 6) >> 1;
            if (i12 == 0) {
                c28Var.K = 1;
                int[] iArr = c28Var.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c28Var.L = iArr;
                iArr[0] = (i2 - c28Var.N) - 3;
            } else {
                c28Var.f(ra4Var, 4);
                int i13 = (yafVar3.a[3] & 255) + 1;
                c28Var.K = i13;
                int[] iArr2 = c28Var.L;
                if (iArr2 == null) {
                    iArr2 = new int[i13];
                } else if (iArr2.length < i13) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i13)];
                }
                c28Var.L = iArr2;
                if (i12 == 2) {
                    int i14 = (i2 - c28Var.N) - 4;
                    int i15 = c28Var.K;
                    Arrays.fill(iArr2, 0, i15, i14 / i15);
                } else {
                    if (i12 != 1) {
                        if (i12 != 3) {
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unexpected lacing value: ");
                            sb2.append(i12);
                            throw ParserException.a(null, sb2.toString());
                        }
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            int i18 = c28Var.K - i9;
                            if (i16 >= i18) {
                                c28Var.L[i18] = ((i2 - c28Var.N) - i7) - i17;
                                break;
                            }
                            c28Var.L[i16] = i8;
                            int i19 = i7 + 1;
                            c28Var.f(ra4Var, i19);
                            if (yafVar3.a[i7] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i20 = i8;
                            int i21 = 8;
                            while (true) {
                                if (i20 >= i21) {
                                    j = 0;
                                    i7 = i19;
                                    break;
                                }
                                int i22 = i9 << (7 - i20);
                                if ((yafVar3.a[i7] & i22) != 0) {
                                    int i23 = i19 + i20;
                                    c28Var.f(ra4Var, i23);
                                    j = yafVar3.a[i7] & 255 & (~i22);
                                    while (i19 < i23) {
                                        j = (j << 8) | (yafVar3.a[i19] & 255);
                                        i19++;
                                        i23 = i23;
                                    }
                                    int i24 = i23;
                                    if (i16 > 0) {
                                        j -= (1 << ((i20 * 7) + 6)) - 1;
                                    }
                                    i7 = i24;
                                } else {
                                    i20++;
                                    i21 = 8;
                                    i9 = 1;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i25 = (int) j;
                            int[] iArr3 = c28Var.L;
                            if (i16 != 0) {
                                i25 += iArr3[i16 - 1];
                            }
                            iArr3[i16] = i25;
                            i17 += i25;
                            i16++;
                            i8 = 0;
                            i9 = 1;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        i4 = c28Var.K - 1;
                        if (i26 >= i4) {
                            break;
                        }
                        c28Var.L[i26] = 0;
                        while (true) {
                            i5 = i7 + 1;
                            c28Var.f(ra4Var, i5);
                            int i28 = yafVar3.a[i7] & 255;
                            int[] iArr4 = c28Var.L;
                            i6 = iArr4[i26] + i28;
                            iArr4[i26] = i6;
                            if (i28 != 255) {
                                break;
                            } else {
                                i7 = i5;
                            }
                        }
                        i27 += i6;
                        i26++;
                        i7 = i5;
                    }
                    c28Var.L[i4] = ((i2 - c28Var.N) - i7) - i27;
                }
            }
            byte[] bArr6 = yafVar3.a;
            c28Var.H = c28Var.k((bArr6[1] & 255) | (bArr6[0] << 8)) + c28Var.B;
            c28Var.O = (a28Var6.d == 2 || (i == 163 && (yafVar3.a[2] & 128) == 128)) ? 1 : 0;
            c28Var.G = 2;
            c28Var.J = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i29 = c28Var.J;
                if (i29 >= c28Var.K) {
                    c28Var.G = 0;
                    return;
                } else {
                    c28Var.c(a28Var6, c28Var.H + ((c28Var.J * a28Var6.e) / 1000), c28Var.O, c28Var.l(ra4Var, a28Var6, c28Var.L[i29]), 0);
                    c28Var.J++;
                }
            }
        } else {
            while (true) {
                int i30 = c28Var.J;
                if (i30 >= c28Var.K) {
                    return;
                }
                int[] iArr5 = c28Var.L;
                iArr5[i30] = c28Var.l(ra4Var, a28Var6, iArr5[i30]);
                c28Var.J++;
            }
        }
    }

    @Override // defpackage.zde
    public String m() {
        return (String) this.b;
    }

    @Override // defpackage.nq8
    public void n(Object obj) {
        ((pq9) this.b).getClass();
    }

    @Override // defpackage.co7
    public void o(fo7 fo7Var, long j, long j2, boolean z) {
        ((x14) this.b).r((aqa) fo7Var, j, j2);
    }

    public wg8 p() {
        if (((ArrayList) this.b) == null) {
            return wg8.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new wg8((ArrayList) this.b, bundle);
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        nl7 nl7Var = (nl7) this.b;
        c54.p("The result can only set once!", nl7Var.Y == null);
        nl7Var.Y = lq1Var;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.n43
    public void r(tld tldVar, Throwable th) {
        ((yxc) this.b).getClass();
        Object objB = tldVar.b();
        ta5.m("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(tldVar)), objB != null ? objB.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    public boolean s(String str) {
        String strB = B(str);
        return "1".equals(strB) || Boolean.parseBoolean(strB);
    }

    @Override // defpackage.ys3
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // defpackage.ys3
    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public ByteBuffer t() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public Integer u(String str) {
        String strB = B(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strB));
        } catch (NumberFormatException unused) {
            R(str);
            return null;
        }
    }

    public JSONArray v(String str) {
        String strB = B(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return new JSONArray(strB);
        } catch (JSONException unused) {
            R(str);
            return null;
        }
    }

    public int w() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public String x(Resources resources, String str, String str2) {
        String[] strArr;
        String strB = B(str2);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = B(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strB2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strB2, "string", str);
        if (identifier == 0) {
            R(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayV = v(str2.concat("_loc_args"));
        if (jSONArrayV == null) {
            strArr = null;
        } else {
            int length = jSONArrayV.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayV.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            R(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    @Override // defpackage.co7
    public void y(fo7 fo7Var, long j, long j2) {
        aqa aqaVar = (aqa) fo7Var;
        x14 x14Var = (x14) this.b;
        x14Var.getClass();
        long j3 = aqaVar.a;
        z24 z24Var = aqaVar.b;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, z24Var, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        x14Var.n.getClass();
        x14Var.q.f(xn7Var, aqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        h14 h14Var = (h14) aqaVar.Y;
        h14 h14Var2 = x14Var.H;
        int size = h14Var2 == null ? 0 : h14Var2.m.size();
        long j4 = h14Var.b(0).b;
        int i = 0;
        while (i < size && x14Var.H.b(i).b < j4) {
            i++;
        }
        if (h14Var.d) {
            if (size - i <= h14Var.m.size()) {
                long j5 = x14Var.N;
                if (j5 == -9223372036854775807L || h14Var.h * 1000 > j5) {
                    x14Var.M = 0;
                }
            }
            int i2 = x14Var.M;
            x14Var.M = i2 + 1;
            if (i2 < x14Var.n.v(aqaVar.c)) {
                x14Var.D.postDelayed(x14Var.v, Math.min((x14Var.M - 1) * 1000, 5000));
                return;
            } else {
                x14Var.C = new DashManifestStaleException();
                return;
            }
        }
        x14Var.H = h14Var;
        x14Var.I = h14Var.d & x14Var.I;
        x14Var.J = j - j2;
        x14Var.K = j;
        synchronized (x14Var.t) {
            try {
                if (aqaVar.b.a == x14Var.F) {
                    Uri uri = x14Var.H.k;
                    if (uri == null) {
                        uri = aqaVar.o.c;
                    }
                    x14Var.F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            x14Var.O += i;
            x14Var.s(true);
            return;
        }
        h14 h14Var3 = x14Var.H;
        if (!h14Var3.d) {
            x14Var.s(true);
            return;
        }
        m94 m94Var = h14Var3.i;
        if (m94Var == null) {
            x14Var.q();
            return;
        }
        String str = m94Var.b;
        if (maf.a(str, "urn:mpeg:dash:utc:direct:2014") || maf.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                x14Var.L = maf.G(m94Var.c) - x14Var.K;
                x14Var.s(true);
                return;
            } catch (ParserException e) {
                fm9.c("Failed to resolve time offset.", e);
                x14Var.s(true);
                return;
            }
        }
        if (maf.a(str, "urn:mpeg:dash:utc:http-iso:2014") || maf.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            aqa aqaVar2 = new aqa(x14Var.z, Uri.parse(m94Var.c), 5, new v14());
            x14Var.q.k(new xn7(aqaVar2.a, aqaVar2.b, x14Var.A.w(aqaVar2, new gaa(x14Var), 1)), aqaVar2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            return;
        }
        if (maf.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || maf.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            aqa aqaVar3 = new aqa(x14Var.z, Uri.parse(m94Var.c), 5, new qx7(9));
            x14Var.q.k(new xn7(aqaVar3.a, aqaVar3.b, x14Var.A.w(aqaVar3, new gaa(x14Var), 1)), aqaVar3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (maf.a(str, "urn:mpeg:dash:utc:ntp:2014") || maf.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            x14Var.q();
        } else {
            fm9.c("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            x14Var.s(true);
        }
    }

    @Override // defpackage.co7
    public b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        aqa aqaVar = (aqa) fo7Var;
        x14 x14Var = (x14) this.b;
        x14Var.getClass();
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        x14Var.n.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        b11 b11VarE = jMin == -9223372036854775807L ? jo7.Y : jo7.e(jMin, false);
        x14Var.q.i(xn7Var, aqaVar.c, iOException, !b11VarE.a());
        return b11VarE;
    }

    public /* synthetic */ sy4(int i, boolean z) {
        this.a = i;
    }

    public sy4(Resources resources) throws Resources.NotFoundException, IOException {
        this.a = 0;
        hm9.n(sy4.class.getName(), "Create emoji tree from bin. Start");
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(dga.a);
            try {
                byte[] bArr = new byte[4];
                inputStreamOpenRawResource.read(bArr);
                int i = 0;
                char c2 = '\b';
                this.b = new long[(bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)];
                byte[] bArr2 = new byte[inputStreamOpenRawResource.available() & (-8)];
                int i2 = 0;
                while (true) {
                    int i3 = inputStreamOpenRawResource.read(bArr2);
                    if (i3 != -1) {
                        int i4 = i3 / 8;
                        int i5 = i;
                        while (i5 < i4) {
                            int i6 = i5 * 8;
                            ((long[]) this.b)[i2 + i5] = ((bArr2[i6 + 1] & 255) << 48) | (bArr2[i6] << 56) | ((bArr2[i6 + 2] & 255) << 40) | ((bArr2[i6 + 3] & 255) << 32) | ((bArr2[i6 + 4] & 255) << 24) | ((bArr2[i6 + 5] & 255) << 16) | ((bArr2[i6 + 6] & 255) << 8) | (bArr2[i6 + 7] & 255);
                            i5++;
                            c2 = '\b';
                        }
                        i2 += i4;
                        i = 0;
                    } else {
                        hm9.n(sy4.class.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length);
                        inputStreamOpenRawResource.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            hm9.p(sy4.class.getName(), "Can't create emoji tree from bin", e);
            throw e;
        }
    }

    public sy4(int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.b = new LinkedHashMap();
                break;
            case 29:
                this.b = wz4.a;
                break;
            default:
                this.b = new yaf(10);
                break;
        }
    }

    public sy4(Bundle bundle) {
        this.a = 23;
        this.b = new Bundle(bundle);
    }

    public sy4(ClipData clipData, int i) {
        this.a = 10;
        this.b = m30.k(clipData, i);
    }

    public sy4(bt3 bt3Var) {
        this.a = 10;
        xs3.m();
        ContentInfo contentInfoP = bt3Var.a.p();
        Objects.requireNonNull(contentInfoP);
        this.b = xs3.j(m30.m(contentInfoP));
    }
}
