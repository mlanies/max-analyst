package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h60 {
    public final zw6 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public j60 d;
    public j60 e;
    public boolean f;

    public h60(zw6 zw6Var) {
        this.a = zw6Var;
        j60 j60Var = j60.e;
        this.d = j60Var;
        this.e = j60Var;
        this.f = false;
    }

    public final j60 a(j60 j60Var) {
        if (j60Var.equals(j60.e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
        }
        int i = 0;
        while (true) {
            zw6 zw6Var = this.a;
            if (i >= zw6Var.size()) {
                this.e = j60Var;
                return j60Var;
            }
            m60 m60Var = (m60) zw6Var.get(i);
            j60 j60VarE = m60Var.e(j60Var);
            if (m60Var.isActive()) {
                fm9.k(!j60VarE.equals(j60.e));
                j60Var = j60VarE;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            zw6 zw6Var = this.a;
            if (i >= zw6Var.size()) {
                break;
            }
            m60 m60Var = (m60) zw6Var.get(i);
            m60Var.flush();
            if (m60Var.isActive()) {
                arrayList.add(m60Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((m60) arrayList.get(i2)).a();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return m60.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(m60.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((m60) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h60)) {
            return false;
        }
        h60 h60Var = (h60) obj;
        zw6 zw6Var = this.a;
        if (zw6Var.size() != h60Var.a.size()) {
            return false;
        }
        for (int i = 0; i < zw6Var.size(); i++) {
            if (zw6Var.get(i) != h60Var.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m60 m60Var = (m60) arrayList.get(i);
                    if (!m60Var.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : m60.a;
                        long jRemaining = byteBuffer2.remaining();
                        m60Var.b(byteBuffer2);
                        this.c[i] = m60Var.a();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((m60) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        }
    }

    public final void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        ((m60) this.b.get(0)).c();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i = 0;
        while (true) {
            zw6 zw6Var = this.a;
            if (i >= zw6Var.size()) {
                this.c = new ByteBuffer[0];
                j60 j60Var = j60.e;
                this.d = j60Var;
                this.e = j60Var;
                this.f = false;
                return;
            }
            m60 m60Var = (m60) zw6Var.get(i);
            m60Var.flush();
            m60Var.reset();
            i++;
        }
    }
}
