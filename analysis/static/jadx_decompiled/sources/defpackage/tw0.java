package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.connection.RouteException;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class tw0 implements p37 {
    public static final tw0 b = new tw0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ tw0(int i) {
        this.a = i;
    }

    @Override // defpackage.p37
    public final yic a(h8c h8cVar) throws IOException {
        cj6 cj6Var;
        int i = 5;
        Object obj = null;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                mhc mhcVar = (mhc) h8cVar.i;
                y7g y7gVar = new y7g(mhcVar, i, obj);
                if (mhcVar != null) {
                    jw0 jw0VarA = mhcVar.a;
                    if (jw0VarA == null) {
                        int i2 = jw0.n;
                        jw0VarA = tpa.A(mhcVar.d);
                        mhcVar.a = jw0VarA;
                    }
                    if (jw0VarA.j) {
                        y7gVar = new y7g(obj, i, obj);
                    }
                }
                b8c b8cVar = (b8c) h8cVar.f;
                if (!(b8cVar instanceof b8c)) {
                    b8cVar = null;
                }
                if (b8cVar != null) {
                    dp3 dp3Var = b8cVar.b;
                }
                mhc mhcVar2 = (mhc) y7gVar.b;
                yic yicVar = (yic) y7gVar.c;
                if (mhcVar2 == null && yicVar == null) {
                    xic xicVar = new xic();
                    xicVar.a = mhcVar;
                    xicVar.b = sob.HTTP_1_1;
                    xicVar.c = HttpStatus.SC_GATEWAY_TIMEOUT;
                    xicVar.d = "Unsatisfiable Request (only-if-cached)";
                    xicVar.g = naf.c;
                    xicVar.k = -1L;
                    xicVar.l = System.currentTimeMillis();
                    return xicVar.a();
                }
                if (mhcVar2 == null) {
                    xic xicVarN = yicVar.n();
                    yic yicVarA = pq9.a(yicVar);
                    xic.b(yicVarA, "cacheResponse");
                    xicVarN.i = yicVarA;
                    return xicVarN.a();
                }
                yic yicVarD = h8cVar.d(mhcVar2);
                if (yicVar != null) {
                    if (yicVarD.o == 304) {
                        xic xicVarN2 = yicVar.n();
                        ArrayList arrayList = new ArrayList(20);
                        cj6 cj6Var2 = yicVar.Y;
                        int size = cj6Var2.size();
                        int i3 = 0;
                        while (true) {
                            cj6 cj6Var3 = yicVarD.Y;
                            if (i3 >= size) {
                                int size2 = cj6Var3.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    String strB = cj6Var3.b(i4);
                                    if (!HTTP.CONTENT_LEN.equalsIgnoreCase(strB) && !HTTP.CONTENT_ENCODING.equalsIgnoreCase(strB) && !HTTP.CONTENT_TYPE.equalsIgnoreCase(strB) && pq9.t(strB)) {
                                        String strD = cj6Var3.d(i4);
                                        arrayList.add(strB);
                                        arrayList.add(w9e.b1(strD).toString());
                                    }
                                }
                                Object[] array = arrayList.toArray(new String[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                bj6 bj6Var = new bj6();
                                d63.X(bj6Var.a, (String[]) array);
                                xicVarN2.f = bj6Var;
                                xicVarN2.k = yicVarD.v0;
                                xicVarN2.l = yicVarD.w0;
                                yic yicVarA2 = pq9.a(yicVar);
                                xic.b(yicVarA2, "cacheResponse");
                                xicVarN2.i = yicVarA2;
                                yic yicVarA3 = pq9.a(yicVarD);
                                xic.b(yicVarA3, "networkResponse");
                                xicVarN2.h = yicVarA3;
                                xicVarN2.a();
                                yicVarD.Z.close();
                                throw null;
                            }
                            String strB2 = cj6Var2.b(i3);
                            String strD2 = cj6Var2.d(i3);
                            if ("Warning".equalsIgnoreCase(strB2)) {
                                cj6Var = cj6Var2;
                                if (!eae.o0(strD2, "1", false)) {
                                }
                                i3++;
                                cj6Var2 = cj6Var;
                            } else {
                                cj6Var = cj6Var2;
                            }
                            if (HTTP.CONTENT_LEN.equalsIgnoreCase(strB2) || HTTP.CONTENT_ENCODING.equalsIgnoreCase(strB2) || HTTP.CONTENT_TYPE.equalsIgnoreCase(strB2) || !pq9.t(strB2) || cj6Var3.a(strB2) == null) {
                                arrayList.add(strB2);
                                arrayList.add(w9e.b1(strD2).toString());
                            }
                            i3++;
                            cj6Var2 = cj6Var;
                        }
                    } else {
                        i8c i8cVar = yicVar.Z;
                        if (i8cVar != null) {
                            naf.c(i8cVar);
                        }
                    }
                }
                xic xicVarN3 = yicVarD.n();
                yic yicVarA4 = pq9.a(yicVar);
                xic.b(yicVarA4, "cacheResponse");
                xicVarN3.i = yicVarA4;
                yic yicVarA5 = pq9.a(yicVarD);
                xic.b(yicVarA5, "networkResponse");
                xicVarN3.h = yicVarA5;
                return xicVarN3.a();
            default:
                b8c b8cVar2 = (b8c) h8cVar.f;
                synchronized (b8cVar2) {
                    try {
                        if (!b8cVar2.w0) {
                            throw new IllegalStateException("released".toString());
                        }
                        if (!(!b8cVar2.v0)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (!(!b8cVar2.u0)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                v45 v45Var = b8cVar2.Y;
                u2a u2aVar = b8cVar2.A0;
                v45Var.getClass();
                try {
                    u45 u45VarJ = v45Var.a(h8cVar.c, h8cVar.d, h8cVar.e, u2aVar.L0, u2aVar.Y, !tpa.f(((mhc) h8cVar.i).c, HttpGet.METHOD_NAME)).j(u2aVar, h8cVar);
                    dp3 dp3Var2 = dp3.c;
                    od odVar = new od();
                    odVar.c = b8cVar2;
                    odVar.o = dp3Var2;
                    odVar.X = v45Var;
                    odVar.Y = u45VarJ;
                    odVar.b = u45VarJ.f();
                    b8cVar2.t0 = odVar;
                    b8cVar2.y0 = odVar;
                    synchronized (b8cVar2) {
                        b8cVar2.u0 = true;
                        b8cVar2.v0 = true;
                    }
                    if (b8cVar2.x0) {
                        throw new IOException("Canceled");
                    }
                    return h8c.c(h8cVar, 0, odVar, null, 61).d((mhc) h8cVar.i);
                } catch (IOException e) {
                    v45Var.b(e);
                    throw new RouteException(e);
                } catch (RouteException e2) {
                    v45Var.b(e2.a);
                    throw e2;
                }
        }
    }
}
