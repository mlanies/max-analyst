package defpackage;

import android.media.MediaDrmException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class dp3 implements l30, fu3, ed6, s65, df9, edc {
    public static volatile l7b b;
    public static final dp3 a = new dp3();
    public static final dp3 c = new dp3();
    public static final dp3 o = new dp3();
    public static final p4c X = new p4c(19);
    public static final /* synthetic */ dp3 Y = new dp3();

    public static boolean b(o97 o97Var) {
        l7b l7bVar = b;
        if (l7bVar == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        if (ju0.b(l7bVar, "system.shutdown.until.ts")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("system.");
        sb.append(o97Var.b);
        sb.append(".shutdown.until.ts");
        return ju0.b(l7bVar, sb.toString());
    }

    public static hdb c(String str) {
        v25 v25Var = hdb.Z;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            hdb hdbVar = (hdb) u1Var.next();
            if (tpa.f(hdbVar.a, str)) {
                return hdbVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.s65
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public q65 d() {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public pz3 f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public byte[] g() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.s65
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public void k(byte[] bArr) {
    }

    @Override // defpackage.s65
    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public void m(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public o65 n(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.s65
    public int o() {
        return 1;
    }

    @Override // defpackage.s65
    public void p(sy4 sy4Var) {
    }

    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        if (!(unsatisfiedLinkError instanceof mud) || (unsatisfiedLinkError instanceof lud)) {
            return false;
        }
        String str = ((mud) unsatisfiedLinkError).a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (nud nudVar : nudVarArr) {
            if (nudVar instanceof p5f) {
                p5f p5fVar = (p5f) nudVar;
                if (p5fVar instanceof of0) {
                    continue;
                } else {
                    try {
                        p5fVar.getClass();
                        p5fVar.d(2);
                    } catch (Exception unused) {
                        p5fVar.getClass();
                        return false;
                    }
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

    @Override // defpackage.s65
    public void release() {
    }

    @Override // defpackage.fu3
    public Object u(Task task) throws IOException {
        if (task.h()) {
            return (Bundle) task.f();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.e()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
    }
}
