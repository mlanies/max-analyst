package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class aab implements erd, b66, f1d, y2a, fu3 {
    public Object a;
    public Object b;

    public /* synthetic */ aab(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static bkb e(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        String strSubstring;
        String str;
        bc7[] bc7VarArr = e4c.a;
        RTCStats rTCStats2 = rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get("codecId"));
        String str2 = "";
        if (rTCStats2 != null && (strSubstring = (String) e4c.b.T0(rTCStats2, e4c.a[0])) != null) {
            int iV0 = w9e.v0(strSubstring);
            while (true) {
                if (-1 < iV0) {
                    if (strSubstring.charAt(iV0) == '/') {
                        strSubstring = strSubstring.substring(iV0 + 1);
                        break;
                    }
                    iV0--;
                } else {
                    break;
                }
            }
        } else {
            strSubstring = "";
        }
        m82 m82Var = e4c.d;
        bc7[] bc7VarArr2 = e4c.a;
        String str3 = (String) m82Var.T0(rTCStats, bc7VarArr2[2]);
        if (str3 == null && (str3 = (String) e4c.c.T0(rTCStats, bc7VarArr2[1])) == null) {
            str3 = "";
        }
        if (rTCStats2 != null && (str = (String) e4c.e.T0(rTCStats2, bc7VarArr2[3])) != null) {
            str2 = str;
        }
        if (rTCStats2 != null) {
        }
        return new bkb(strSubstring, str3, str2);
    }

    public static gpd f(JSONObject jSONObject) {
        bg1 bg1VarA = bg1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        return new gpd(j, string.equals("STREAM") ? pcc.c : string.equals("RECORD") ? pcc.b : pcc.a, bg1VarA, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), f8.t(jSONObject, "recordExternalMovieId"), f8.t(jSONObject, "recordExternalOwnerId"));
    }

    public static z9b k() {
        String string;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String line = randomAccessFile.readLine(); line != null; line = randomAccessFile.readLine()) {
                    sb.append(line);
                }
                string = sb.toString();
                v3c.i(randomAccessFile, null);
            } finally {
            }
        } catch (IOException unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        List listQ0 = w9e.Q0(string, new String[]{" "}, false, 6);
        if (listQ0.size() <= 22) {
            return null;
        }
        try {
            return new z9b(Long.parseLong((String) listQ0.get(13)), Long.parseLong((String) listQ0.get(14)), Long.parseLong((String) listQ0.get(15)), Long.parseLong((String) listQ0.get(16)), Long.parseLong((String) listQ0.get(21)));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    @Override // defpackage.y2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.x6g P(android.view.View r14, defpackage.x6g r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            w3 r0 = (defpackage.w3) r0
            int r1 = r0.a
            java.lang.Object r13 = r13.a
            ar0 r13 = (defpackage.ar0) r13
            r13.getClass()
            v6g r2 = r15.a
            r3 = 7
            v27 r3 = r2.f(r3)
            r4 = 32
            v27 r2 = r2.f(r4)
            int r4 = r3.b
            java.lang.Object r5 = r13.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r5
            r5.w = r4
            boolean r4 = defpackage.mqd.t(r14)
            int r6 = r14.getPaddingBottom()
            int r7 = r14.getPaddingLeft()
            int r8 = r14.getPaddingRight()
            boolean r9 = r5.o
            if (r9 == 0) goto L3f
            int r6 = r15.a()
            r5.v = r6
            int r10 = r0.c
            int r6 = r6 + r10
        L3f:
            int r0 = r0.b
            boolean r10 = r5.p
            int r11 = r3.a
            if (r10 == 0) goto L4d
            if (r4 == 0) goto L4b
            r7 = r0
            goto L4c
        L4b:
            r7 = r1
        L4c:
            int r7 = r7 + r11
        L4d:
            boolean r10 = r5.q
            int r12 = r3.c
            if (r10 == 0) goto L59
            if (r4 == 0) goto L56
            goto L57
        L56:
            r1 = r0
        L57:
            int r8 = r1 + r12
        L59:
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            boolean r1 = r5.s
            r4 = 1
            if (r1 == 0) goto L6c
            int r1 = r0.leftMargin
            if (r1 == r11) goto L6c
            r0.leftMargin = r11
            r1 = r4
            goto L6d
        L6c:
            r1 = 0
        L6d:
            boolean r10 = r5.t
            if (r10 == 0) goto L78
            int r10 = r0.rightMargin
            if (r10 == r12) goto L78
            r0.rightMargin = r12
            r1 = r4
        L78:
            boolean r10 = r5.u
            if (r10 == 0) goto L85
            int r10 = r0.topMargin
            int r3 = r3.b
            if (r10 == r3) goto L85
            r0.topMargin = r3
            goto L86
        L85:
            r4 = r1
        L86:
            if (r4 == 0) goto L8b
            r14.setLayoutParams(r0)
        L8b:
            int r0 = r14.getPaddingTop()
            r14.setPadding(r7, r0, r8, r6)
            boolean r13 = r13.a
            if (r13 == 0) goto L9a
            int r14 = r2.d
            r5.m = r14
        L9a:
            if (r9 != 0) goto L9e
            if (r13 == 0) goto La1
        L9e:
            r5.R()
        La1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.P(android.view.View, x6g):x6g");
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        ((erd) this.b).a(obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return qi8.m((qi8) this.a, (fk2) obj, (String) this.b);
    }

    @Override // defpackage.f1d
    public void b(tue tueVar, pa5 pa5Var, l3f l3fVar) {
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        dm4.c((AtomicReference) this.a, zl4Var);
    }

    @Override // defpackage.f1d
    public void d(wpa wpaVar) {
        i3f i3fVar;
        if (wpaVar.u() == 0 && (wpaVar.u() & 128) != 0) {
            wpaVar.H(6);
            int iA = wpaVar.a() / 4;
            int i = 0;
            while (true) {
                i3fVar = (i3f) this.b;
                if (i >= iA) {
                    break;
                }
                s02 s02Var = (s02) this.a;
                wpaVar.e(0, s02Var.b, 4);
                s02Var.q(0);
                int i2 = s02Var.i(16);
                s02Var.t(3);
                if (i2 == 0) {
                    s02Var.t(13);
                } else {
                    int i3 = s02Var.i(13);
                    if (i3fVar.s0.get(i3) == null) {
                        i3fVar.s0.put(i3, new h1d(new l0f(i3fVar, i3)));
                        i3fVar.y0++;
                    }
                }
                i++;
            }
            if (i3fVar.a != 2) {
                i3fVar.s0.remove(0);
            }
        }
    }

    public synchronized void g(ip7 ip7Var) {
        ((Executor) this.a).execute(ip7Var);
    }

    public void h() {
        int[] iArr = (int[]) this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public void i(pa5 pa5Var, l3f l3fVar) {
        int i = 0;
        while (true) {
            yze[] yzeVarArr = (yze[]) this.b;
            if (i >= yzeVarArr.length) {
                return;
            }
            l3fVar.a();
            l3fVar.b();
            yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 3);
            qy5 qy5Var = (qy5) ((List) this.a).get(i);
            String str = qy5Var.n;
            fm9.e("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = qy5Var.a;
            if (str2 == null) {
                l3fVar.b();
                str2 = l3fVar.f;
            }
            ny5 ny5Var = new ny5();
            ny5Var.a = str2;
            ny5Var.m = ia9.l(str);
            ny5Var.e = qy5Var.e;
            ny5Var.d = qy5Var.d;
            ny5Var.F = qy5Var.G;
            ny5Var.p = qy5Var.q;
            yzeVarMo6B.e(new qy5(ny5Var));
            yzeVarArr[i] = yzeVarMo6B;
            i++;
        }
    }

    public void j(int i) {
        int[] iArr = (int[]) this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
        L12:
            r0 = r1
            goto L6f
        L14:
            r2 = 0
            if (r0 != 0) goto L18
            goto L33
        L18:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1e:
            if (r0 < 0) goto L33
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            oxd r3 = (defpackage.oxd) r3
            int r4 = r3.a
            if (r4 != r6) goto L30
            r2 = r3
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L1e
        L33:
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3c:
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L45:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            oxd r3 = (defpackage.oxd) r3
            int r3 = r3.a
            if (r3 < r6) goto L56
            goto L5a
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            r2 = r1
        L5a:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            oxd r0 = (defpackage.oxd) r0
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.a
        L6f:
            if (r0 != r1) goto L7f
            java.lang.Object r0 = r5.a
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.a
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L7f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.a
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r5 = r5.a
            int[] r5 = (int[]) r5
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.l(int):int");
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        j(i3);
        int[] iArr2 = (int[]) this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.a, i, i3, -1);
        List list = (List) this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            oxd oxdVar = (oxd) ((List) this.b).get(size);
            int i4 = oxdVar.a;
            if (i4 >= i) {
                oxdVar.a = i4 + i2;
            }
        }
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        j(i3);
        int[] iArr2 = (int[]) this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = (List) this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            oxd oxdVar = (oxd) ((List) this.b).get(size);
            int i4 = oxdVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((List) this.b).remove(size);
                } else {
                    oxdVar.a = i4 - i2;
                }
            }
        }
    }

    public synchronized void o(ip7 ip7Var) {
        ((ArrayDeque) this.b).remove(ip7Var);
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        ((erd) this.b).onError(th);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public defpackage.c4c p(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r63v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public void q(jlf jlfVar) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new fre(this, 12, jlfVar));
        }
    }

    public void r(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.a)) {
            map = new HashMap((Map) this.a);
        }
        synchronized (((Map) this.b)) {
            map2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).Q(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((qne) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        Bundle bundle;
        goc gocVar = (goc) this.a;
        gocVar.getClass();
        return (task.h() && (bundle = (Bundle) task.f()) != null && bundle.containsKey("google.messenger")) ? gocVar.a((Bundle) this.b).l(ok4.o, o84.s0) : task;
    }

    public aab(int i) {
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.a = Collections.synchronizedMap(new WeakHashMap());
                this.b = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.a = new khe(h8.t0);
                this.b = new khe(h8.s0);
                break;
        }
    }

    public aab(String str) {
        this.a = str;
        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public aab(List list) {
        this.a = list;
        this.b = new yze[list.size()];
    }
}
