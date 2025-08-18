package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u7c extends xpa {
    public static final int Y0 = ya7.ALLOW_TRAILING_COMMA.b;
    public static final int Z0 = ya7.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int a1 = ya7.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int b1 = ya7.ALLOW_MISSING_VALUES.b;
    public static final int c1 = ya7.ALLOW_SINGLE_QUOTES.b;
    public static final int d1 = ya7.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int e1 = ya7.ALLOW_COMMENTS.b;
    public static final int f1 = ya7.ALLOW_YAML_COMMENTS.b;
    public static final int[] g1 = w42.c;
    public Reader S0;
    public char[] T0;
    public final boolean U0;
    public final z42 V0;
    public final int W0;
    public boolean X0;

    public u7c(wr6 wr6Var, int i, z42 z42Var, char[] cArr, int i2, int i3, boolean z) {
        super(wr6Var, i);
        this.S0 = null;
        this.T0 = cArr;
        this.X = i2;
        this.Y = i3;
        this.V0 = z42Var;
        this.W0 = z42Var.c;
        this.U0 = z;
    }

    @Override // defpackage.xpa
    public final void D0() {
        char[] cArr;
        z42 z42Var;
        super.D0();
        z42 z42Var2 = this.V0;
        if ((!z42Var2.l) && (z42Var = z42Var2.a) != null && z42Var2.e) {
            y42 y42Var = new y42(z42Var2);
            AtomicReference atomicReference = z42Var.b;
            y42 y42Var2 = (y42) atomicReference.get();
            int i = y42Var2.a;
            int i2 = y42Var.a;
            if (i2 != i) {
                if (i2 > 12000) {
                    y42Var = new y42(new String[64], new x42[32]);
                }
                while (!atomicReference.compareAndSet(y42Var2, y42Var) && atomicReference.get() == y42Var2) {
                }
            }
            z42Var2.l = true;
        }
        if (!this.U0 || (cArr = this.T0) == null) {
            return;
        }
        this.T0 = null;
        wr6 wr6Var = this.c;
        char[] cArr2 = wr6Var.f;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        wr6Var.f = null;
        wr6Var.d.b.set(0, cArr);
    }

    public final void S0(int i) throws JsonParseException {
        if (i == 93) {
            int i2 = this.X;
            this.u0 = this.s0;
            this.v0 = i2 - this.t0;
            if (!this.w0.b()) {
                H0('}', i);
                throw null;
            }
            this.w0 = this.w0.c;
            this.b = hb7.END_ARRAY;
        }
        if (i == 125) {
            int i3 = this.X;
            this.u0 = this.s0;
            this.v0 = i3 - this.t0;
            if (!this.w0.c()) {
                H0(']', i);
                throw null;
            }
            this.w0 = this.w0.c;
            this.b = hb7.END_OBJECT;
        }
    }

    public final char T0() throws JsonParseException {
        if (this.X >= this.Y && !X0()) {
            hb7 hb7Var = hb7.NOT_AVAILABLE;
            F0(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.T0;
        int i = this.X;
        this.X = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            z0(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.X >= this.Y && !X0()) {
                hb7 hb7Var2 = hb7.NOT_AVAILABLE;
                F0(" in character escape sequence");
                throw null;
            }
            char[] cArr2 = this.T0;
            int i4 = this.X;
            this.X = i4 + 1;
            char c2 = cArr2[i4];
            int i5 = w42.i[c2 & 255];
            if (i5 < 0) {
                I0(c2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i5;
        }
        return (char) i2;
    }

    public final void U0() throws JsonParseException {
        int i = this.X;
        int i2 = this.Y;
        int[] iArr = g1;
        woe woeVar = this.y0;
        if (i < i2) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.T0;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    int i3 = this.X;
                    woeVar.s(cArr, i3, i - i3);
                    this.X = i + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.T0;
        int i4 = this.X;
        int i5 = i - i4;
        woeVar.i = null;
        woeVar.d = -1;
        woeVar.e = 0;
        woeVar.c = null;
        woeVar.k = null;
        if (woeVar.b) {
            woeVar.c();
        } else if (((char[]) woeVar.j) == null) {
            woeVar.j = woeVar.a(i5);
        }
        woeVar.f = 0;
        woeVar.g = 0;
        if (woeVar.d >= 0) {
            woeVar.u(i5);
        }
        woeVar.c = null;
        woeVar.k = null;
        char[] cArr3 = (char[]) woeVar.j;
        int length2 = cArr3.length;
        int i6 = woeVar.g;
        int i7 = length2 - i6;
        if (i7 >= i5) {
            System.arraycopy(cArr2, i4, cArr3, i6, i5);
            woeVar.g += i5;
        } else {
            if (i7 > 0) {
                System.arraycopy(cArr2, i4, cArr3, i6, i7);
                i4 += i7;
                i5 -= i7;
            }
            do {
                woeVar.n();
                int iMin = Math.min(((char[]) woeVar.j).length, i5);
                System.arraycopy(cArr2, i4, (char[]) woeVar.j, 0, iMin);
                woeVar.g += iMin;
                i4 += iMin;
                i5 -= iMin;
            } while (i5 > 0);
        }
        this.X = i;
        char[] cArrP = woeVar.p();
        int i8 = woeVar.g;
        int length3 = iArr.length;
        while (true) {
            if (this.X >= this.Y && !X0()) {
                hb7 hb7Var = hb7.NOT_AVAILABLE;
                F0(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr4 = this.T0;
            int i9 = this.X;
            this.X = i9 + 1;
            char cT0 = cArr4[i9];
            if (cT0 < length3 && iArr[cT0] != 0) {
                if (cT0 == '\"') {
                    woeVar.g = i8;
                    return;
                } else if (cT0 == '\\') {
                    cT0 = T0();
                } else if (cT0 < ' ') {
                    K0(cT0, "string value");
                }
            }
            if (i8 >= cArrP.length) {
                cArrP = woeVar.o();
                i8 = 0;
            }
            cArrP[i8] = cT0;
            i8++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.hb7 V0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb7 W0(int r10) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.W0(int):hb7");
    }

    public final boolean X0() throws IOException {
        Reader reader = this.S0;
        if (reader != null) {
            char[] cArr = this.T0;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this.Y;
                this.Z += i2;
                this.t0 -= i2;
                this.X = 0;
                this.Y = i;
                return true;
            }
            v0();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.Y);
            }
        }
        return false;
    }

    public final void Y0(int i, String str) throws JsonParseException {
        int i2;
        char c;
        int length = str.length();
        if (this.X + length < this.Y) {
            while (this.T0[this.X] == str.charAt(i)) {
                int i3 = this.X + 1;
                this.X = i3;
                i++;
                if (i >= length) {
                    char c2 = this.T0[i3];
                    if (c2 < '0' || c2 == ']' || c2 == '}' || !Character.isJavaIdentifierPart(c2)) {
                        return;
                    }
                    c1(str.substring(0, i), L0());
                    throw null;
                }
            }
            c1(str.substring(0, i), L0());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.X >= this.Y && !X0()) || this.T0[this.X] != str.charAt(i)) {
                c1(str.substring(0, i), L0());
                throw null;
            }
            i2 = this.X + 1;
            this.X = i2;
            i++;
        } while (i < length2);
        if ((i2 < this.Y || X0()) && (c = this.T0[this.X]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            c1(str.substring(0, i), L0());
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v9 ??, r10v5 ??, r10v4 ??, r10v3 ??, r10v8 ??, r10v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.hb7 Z0(boolean r9, 
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v9 ??, r10v5 ??, r10v4 ??, r10v3 ??, r10v8 ??, r10v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
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

    public final String a1(int i, int i2, int i3) throws JsonParseException {
        char[] cArr = this.T0;
        int i4 = this.X - i;
        woe woeVar = this.y0;
        woeVar.s(cArr, i, i4);
        char[] cArrP = woeVar.p();
        int i5 = woeVar.g;
        while (true) {
            if (this.X >= this.Y && !X0()) {
                hb7 hb7Var = hb7.NOT_AVAILABLE;
                F0(" in field name");
                throw null;
            }
            char[] cArr2 = this.T0;
            int i6 = this.X;
            this.X = i6 + 1;
            char cT0 = cArr2[i6];
            if (cT0 <= '\\') {
                if (cT0 == '\\') {
                    cT0 = T0();
                } else if (cT0 <= i3) {
                    if (cT0 == i3) {
                        woeVar.g = i5;
                        char[] cArrR = woeVar.r();
                        int i7 = woeVar.d;
                        return this.V0.c(cArrR, i7 >= 0 ? i7 : 0, woeVar.t(), i2);
                    }
                    if (cT0 < ' ') {
                        K0(cT0, "name");
                    }
                }
            }
            i2 = (i2 * 33) + cT0;
            int i8 = i5 + 1;
            cArrP[i5] = cT0;
            if (i8 >= cArrP.length) {
                cArrP = woeVar.o();
                i5 = 0;
            } else {
                i5 = i8;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EDGE_INSN: B:25:0x0053->B:47:0x008f BREAK  A[LOOP:0: B:34:0x006c->B:143:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb7 b1(int r17, boolean r18) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.b1(int, boolean):hb7");
    }

    public final void c1(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.X >= this.Y && !X0()) {
                break;
            }
            char c = this.T0[this.X];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.X++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.X
            int r1 = r3.Y
            if (r0 < r1) goto L2c
            boolean r0 = r3.X0()
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected end-of-input within/between "
            r0.<init>(r1)
            bb7 r1 = r3.w0
            java.lang.String r1 = r1.e()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r1 = new com.fasterxml.jackson.core.JsonParseException
            r1.<init>(r3, r0)
            throw r1
        L2c:
            char[] r0 = r3.T0
            int r1 = r3.X
            int r2 = r1 + 1
            r3.X = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L53
            r1 = 47
            if (r0 != r1) goto L42
            r3.g1()
            goto L0
        L42:
            r1 = 35
            if (r0 != r1) goto L52
            int r1 = r3.a
            int r2 = defpackage.u7c.f1
            r1 = r1 & r2
            if (r1 != 0) goto L4e
            goto L52
        L4e:
            r3.h1()
            goto L0
        L52:
            return r0
        L53:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L62
            int r0 = r3.s0
            int r0 = r0 + 1
            r3.s0 = r0
            r3.t0 = r2
            goto L0
        L62:
            r1 = 13
            if (r0 != r1) goto L6a
            r3.e1()
            goto L0
        L6a:
            r1 = 9
            if (r0 != r1) goto L6f
            goto L0
        L6f:
            r3.J0(r0)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.d1():int");
    }

    public final void e1() {
        if (this.X < this.Y || X0()) {
            char[] cArr = this.T0;
            int i = this.X;
            if (cArr[i] == '\n') {
                this.X = i + 1;
            }
        }
        this.s0++;
        this.t0 = this.X;
    }

    public final int f1(boolean z) throws JsonParseException {
        while (true) {
            if (this.X >= this.Y && !X0()) {
                F0(" within/between " + this.w0.e() + " entries");
                throw null;
            }
            char[] cArr = this.T0;
            int i = this.X;
            int i2 = i + 1;
            this.X = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    g1();
                } else if (c == '#' && (this.a & f1) != 0) {
                    h1();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        I0(c, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.s0++;
                this.t0 = i2;
            } else if (c == '\r') {
                e1();
            } else if (c != '\t') {
                J0(c);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        F0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            int r0 = r7.a
            int r1 = defpackage.u7c.e1
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto L8f
            int r0 = r7.X
            int r3 = r7.Y
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r7.X0()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r7.F0(r4)
            throw r1
        L1d:
            char[] r0 = r7.T0
            int r3 = r7.X
            int r5 = r3 + 1
            r7.X = r5
            char r0 = r0[r3]
            if (r0 != r2) goto L2d
            r7.h1()
            goto L66
        L2d:
            r3 = 42
            if (r0 != r3) goto L89
        L31:
            int r0 = r7.X
            int r5 = r7.Y
            if (r0 < r5) goto L3d
            boolean r0 = r7.X0()
            if (r0 == 0) goto L56
        L3d:
            char[] r0 = r7.T0
            int r5 = r7.X
            int r6 = r5 + 1
            r7.X = r6
            char r0 = r0[r5]
            if (r0 > r3) goto L31
            if (r0 != r3) goto L67
            int r0 = r7.Y
            if (r6 < r0) goto L5a
            boolean r0 = r7.X0()
            if (r0 == 0) goto L56
            goto L5a
        L56:
            r7.F0(r4)
            throw r1
        L5a:
            char[] r0 = r7.T0
            int r5 = r7.X
            char r0 = r0[r5]
            if (r0 != r2) goto L31
            int r5 = r5 + 1
            r7.X = r5
        L66:
            return
        L67:
            r5 = 32
            if (r0 >= r5) goto L31
            r5 = 10
            if (r0 != r5) goto L78
            int r0 = r7.s0
            int r0 = r0 + 1
            r7.s0 = r0
            r7.t0 = r6
            goto L31
        L78:
            r5 = 13
            if (r0 != r5) goto L80
            r7.e1()
            goto L31
        L80:
            r5 = 9
            if (r0 != r5) goto L85
            goto L31
        L85:
            r7.J0(r0)
            throw r1
        L89:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r7.I0(r0, r2)
            throw r1
        L8f:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r7.I0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.g1():void");
    }

    public final void h1() throws JsonParseException {
        while (true) {
            if (this.X >= this.Y && !X0()) {
                return;
            }
            char[] cArr = this.T0;
            int i = this.X;
            int i2 = i + 1;
            this.X = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.s0++;
                    this.t0 = i2;
                    return;
                } else if (c == '\r') {
                    e1();
                    return;
                } else if (c != '\t') {
                    J0(c);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.X
            int r1 = r3.Y
            if (r0 < r1) goto L11
            boolean r0 = r3.X0()
            if (r0 != 0) goto L11
            r3.y0()
            r3 = -1
            return r3
        L11:
            char[] r0 = r3.T0
            int r1 = r3.X
            int r2 = r1 + 1
            r3.X = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L38
            r1 = 47
            if (r0 != r1) goto L27
            r3.g1()
            goto L0
        L27:
            r1 = 35
            if (r0 != r1) goto L37
            int r1 = r3.a
            int r2 = defpackage.u7c.f1
            r1 = r1 & r2
            if (r1 != 0) goto L33
            goto L37
        L33:
            r3.h1()
            goto L0
        L37:
            return r0
        L38:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L47
            int r0 = r3.s0
            int r0 = r0 + 1
            r3.s0 = r0
            r3.t0 = r2
            goto L0
        L47:
            r1 = 13
            if (r0 != r1) goto L4f
            r3.e1()
            goto L0
        L4f:
            r1 = 9
            if (r0 != r1) goto L54
            goto L0
        L54:
            r3.J0(r0)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.i1():int");
    }

    public final void j1(int i) throws JsonParseException {
        int i2 = this.X + 1;
        this.X = i2;
        if (i != 9) {
            if (i == 10) {
                this.s0++;
                this.t0 = i2;
            } else if (i == 13) {
                e1();
            } else {
                if (i == 32) {
                    return;
                }
                I0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    public final char k1(String str) throws JsonEOFException {
        if (this.X >= this.Y && !X0()) {
            F0(str);
            throw null;
        }
        char[] cArr = this.T0;
        int i = this.X;
        this.X = i + 1;
        return cArr[i];
    }

    @Override // defpackage.ab7
    public final wa7 o() {
        return new wa7(this.s0, (this.X - this.t0) + 1, -1L, this.Z + this.X, x0());
    }

    @Override // defpackage.ab7
    public final String q0() throws JsonParseException {
        hb7 hb7Var = this.b;
        hb7 hb7Var2 = hb7.VALUE_STRING;
        woe woeVar = this.y0;
        if (hb7Var == hb7Var2) {
            if (this.X0) {
                this.X0 = false;
                U0();
            }
            return woeVar.g();
        }
        if (hb7Var == null) {
            return null;
        }
        int i = hb7Var.o;
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? woeVar.g() : hb7Var.a : this.w0.f;
    }

    @Override // defpackage.ab7
    public final char[] r0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return null;
        }
        int i = hb7Var.o;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return hb7Var.b;
                }
            } else if (this.X0) {
                this.X0 = false;
                U0();
            }
            return this.y0.r();
        }
        if (!this.A0) {
            String str = this.w0.f;
            int length = str.length();
            char[] cArr = this.z0;
            if (cArr == null) {
                wr6 wr6Var = this.c;
                if (wr6Var.h != null) {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
                char[] cArrA = wr6Var.d.a(3, length);
                wr6Var.h = cArrA;
                this.z0 = cArrA;
            } else if (cArr.length < length) {
                this.z0 = new char[length];
            }
            str.getChars(0, length, this.z0, 0);
            this.A0 = true;
        }
        return this.z0;
    }

    @Override // defpackage.ab7
    public final int s0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return 0;
        }
        int i = hb7Var.o;
        if (i == 5) {
            return this.w0.f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return hb7Var.b.length;
            }
        } else if (this.X0) {
            this.X0 = false;
            U0();
        }
        return this.y0.t();
    }

    @Override // defpackage.ab7
    public final int t0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return 0;
        }
        int i = hb7Var.o;
        if (i != 6) {
            if (i != 7 && i != 8) {
                return 0;
            }
        } else if (this.X0) {
            this.X0 = false;
            U0();
        }
        int i2 = this.y0.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0566  */
    @Override // defpackage.ab7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb7 u0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.u0():hb7");
    }

    @Override // defpackage.xpa
    public final void v0() throws IOException {
        if (this.S0 != null) {
            if (this.c.c || ya7.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.S0.close();
            }
            this.S0 = null;
        }
    }

    public u7c(wr6 wr6Var, int i, Reader reader, z42 z42Var) {
        super(wr6Var, i);
        this.S0 = reader;
        if (wr6Var.f == null) {
            char[] cArrA = wr6Var.d.a(0, 0);
            wr6Var.f = cArrA;
            this.T0 = cArrA;
            this.X = 0;
            this.Y = 0;
            this.V0 = z42Var;
            this.W0 = z42Var.c;
            this.U0 = true;
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}
