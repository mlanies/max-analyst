package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m3g implements Closeable {
    public boolean X;
    public boolean Y;
    public boolean a;
    public int b;
    public long c;
    public boolean o;
    public eu8 t0;
    public final fu0 v0;
    public final l3g w0;
    public final boolean x0;
    public final boolean y0;
    public final bt0 Z = new bt0();
    public final bt0 s0 = new bt0();
    public final byte[] u0 = null;

    public m3g(y7c y7cVar, m8c m8cVar, boolean z, boolean z2) {
        this.v0 = y7cVar;
        this.w0 = m8cVar;
        this.x0 = z;
        this.y0 = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        eu8 eu8Var = this.t0;
        if (eu8Var != null) {
            eu8Var.close();
        }
    }

    public final void m() throws IOException {
        String strP0;
        short s;
        m3g m3gVar;
        n3g n3gVar;
        long j = this.c;
        if (j > 0) {
            this.v0.Q(this.Z, j);
        }
        switch (this.b) {
            case 8:
                bt0 bt0Var = this.Z;
                long j2 = bt0Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                e8c e8cVar = null;
                if (j2 != 0) {
                    s = bt0Var.readShort();
                    strP0 = this.Z.p0();
                    String strH = (s < 1000 || s >= 5000) ? zr6.h(s, "Code must be in range [1000,5000): ") : ((1004 > s || 1006 < s) && (1015 > s || 2999 < s)) ? null : wg0.g(s, "Code ", " is reserved and may not be used.");
                    if (strH != null) {
                        throw new ProtocolException(strH);
                    }
                } else {
                    strP0 = "";
                    s = 1005;
                }
                m8c m8cVar = (m8c) this.w0;
                m8cVar.getClass();
                if (s == -1) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                synchronized (m8cVar) {
                    if (m8cVar.m != -1) {
                        throw new IllegalStateException("already closed".toString());
                    }
                    m8cVar.m = s;
                    m8cVar.n = strP0;
                    if (m8cVar.l && m8cVar.j.isEmpty()) {
                        e8c e8cVar2 = m8cVar.h;
                        m8cVar.h = null;
                        m3gVar = m8cVar.d;
                        m8cVar.d = null;
                        n3gVar = m8cVar.e;
                        m8cVar.e = null;
                        m8cVar.f.e();
                        e8cVar = e8cVar2;
                    } else {
                        m3gVar = null;
                        n3gVar = null;
                    }
                }
                try {
                    m8cVar.s.getClass();
                    if (e8cVar != null) {
                        m8cVar.s.a(strP0);
                    }
                    this.a = true;
                    return;
                } finally {
                    if (e8cVar != null) {
                        naf.c(e8cVar);
                    }
                    if (m3gVar != null) {
                        naf.c(m3gVar);
                    }
                    if (n3gVar != null) {
                        naf.c(n3gVar);
                    }
                }
            case 9:
                l3g l3gVar = this.w0;
                bt0 bt0Var2 = this.Z;
                aw0 aw0VarE = bt0Var2.e(bt0Var2.b);
                m8c m8cVar2 = (m8c) l3gVar;
                synchronized (m8cVar2) {
                    try {
                        if (!m8cVar2.o && (!m8cVar2.l || !m8cVar2.j.isEmpty())) {
                            m8cVar2.i.add(aw0VarE);
                            m8cVar2.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                l3g l3gVar2 = this.w0;
                bt0 bt0Var3 = this.Z;
                bt0Var3.e(bt0Var3.b);
                m8c m8cVar3 = (m8c) l3gVar2;
                synchronized (m8cVar3) {
                    m8cVar3.q = false;
                }
                return;
            default:
                int i = this.b;
                byte[] bArr = naf.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i)));
        }
    }

    public final void n() throws IOException {
        boolean z;
        if (this.a) {
            throw new IOException("closed");
        }
        fu0 fu0Var = this.v0;
        long jH = fu0Var.p().h();
        fu0Var.p().b();
        try {
            byte b = fu0Var.readByte();
            byte[] bArr = naf.a;
            fu0Var.p().g(jH, TimeUnit.NANOSECONDS);
            int i = b & 15;
            this.b = i;
            boolean z2 = (b & 128) != 0;
            this.o = z2;
            boolean z3 = (b & 8) != 0;
            this.X = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.x0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.Y = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = fu0Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & Byte.MAX_VALUE;
            this.c = j;
            if (j == 126) {
                this.c = fu0Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = fu0Var.readLong();
                this.c = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.c) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.X && this.c > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                fu0Var.readFully(this.u0);
            }
        } catch (Throwable th) {
            fu0Var.p().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
