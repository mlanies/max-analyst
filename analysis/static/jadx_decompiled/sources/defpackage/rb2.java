package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class rb2 extends ffe implements a66 {
    public ArrayList X;
    public ArrayList Y;
    public zb2 Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ zb2 u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ k56 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb2(zb2 zb2Var, List list, boolean z, k56 k56Var, Continuation continuation) {
        super(2, continuation);
        this.u0 = zb2Var;
        this.v0 = list;
        this.w0 = z;
        this.x0 = k56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rb2 rb2Var = new rb2(this.u0, this.v0, this.w0, this.x0, continuation);
        rb2Var.t0 = obj;
        return rb2Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        ArrayList<at5> arrayList;
        ArrayList arrayList2;
        Object objT0;
        zb2 zb2Var;
        Iterator it;
        String string;
        tx3 tx3Var = tx3.a;
        int i = this.s0;
        e5f e5fVar = e5f.a;
        boolean z = false;
        int i2 = 1;
        CancellationSignal cancellationSignal = null;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.t0;
            if (!j1e.z(sx3Var)) {
                return e5fVar;
            }
            this.u0.E0.set(true);
            arrayList = new ArrayList();
            List list = this.v0;
            zb2 zb2Var2 = this.u0;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                nkc nkcVar = (nkc) it2.next();
                if (!j1e.z(sx3Var)) {
                    zb2Var2.E0.set(z);
                    return e5fVar;
                }
                alc alcVarE = zb2Var2.e();
                String str = nkcVar.a;
                alcVarE.getClass();
                xlc xlcVarA = xlc.a(i2, "SELECT * FROM folder_and_chats WHERE folderId = ?");
                if (str == null) {
                    xlcVarA.W(i2);
                } else {
                    xlcVarA.f(i2, str);
                }
                ilc ilcVar = alcVarE.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, cancellationSignal);
                try {
                    int iN = tfg.n(cursorO, ApiProtocol.PARAM_CHAT_ID);
                    int iN2 = tfg.n(cursorO, "folderId");
                    ArrayList arrayList3 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j = cursorO.getLong(iN);
                        if (cursorO.isNull(iN2)) {
                            it = it2;
                            string = null;
                        } else {
                            it = it2;
                            string = cursorO.getString(iN2);
                        }
                        arrayList3.add(new v52(j, string));
                        it2 = it;
                    }
                    Iterator it3 = it2;
                    cursorO.close();
                    xlcVarA.n();
                    ArrayList arrayListE = zb2Var2.e().e(nkcVar.a);
                    CharSequence charSequenceA = ((hda) zb2Var2.o.getValue()).a(nkcVar.b, nkcVar.h, 2, false, 0, true);
                    nz4 nz4Var = nz4.a;
                    xs xsVar = new xs((Collection) arrayListE);
                    wz4 wz4Var = wz4.a;
                    ?? r6 = nkcVar.h;
                    nz4 nz4Var2 = r6 == 0 ? nz4Var : r6;
                    Map map = nkcVar.j;
                    if (map == null) {
                        map = oz4.a;
                    }
                    Map map2 = map;
                    ?? r62 = nkcVar.k;
                    nz4 nz4Var3 = r62 == 0 ? nz4Var : r62;
                    ?? r63 = nkcVar.l;
                    arrayList.add(new at5(nkcVar.a, charSequenceA, nkcVar.c, nkcVar.d, nz4Var, nkcVar.e, true, nkcVar.f, arrayListE, nkcVar.g, xsVar, wz4Var, wz4Var, nz4Var2, nkcVar.i, map2, nz4Var3, r63 == 0 ? wz4Var : r63));
                    zb2Var2.u0.put(nkcVar.a, arrayList3);
                    it2 = it3;
                    z = false;
                    i2 = 1;
                    cancellationSignal = null;
                } catch (Throwable th) {
                    cursorO.close();
                    xlcVarA.n();
                    throw th;
                }
            }
            if (!j1e.z(sx3Var)) {
                this.u0.E0.set(false);
                return e5fVar;
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            arrayList2 = new ArrayList(arrayList);
            zb2 zb2Var3 = this.u0;
            this.t0 = sx3Var;
            this.X = arrayList;
            this.Y = arrayList2;
            this.Z = zb2Var3;
            this.s0 = 1;
            zb2Var3.getClass();
            objT0 = j47.t0(zb2Var3.Y, new db2(zb2Var3, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            zb2Var = zb2Var3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zb2Var = this.Z;
            arrayList2 = this.Y;
            arrayList = this.X;
            sx3Var = (sx3) this.t0;
            od2.a0(obj);
            objT0 = obj;
        }
        zb2Var.D0 = (at5) objT0;
        us usVar = new us(0);
        zb2 zb2Var4 = this.u0;
        for (at5 at5Var : arrayList) {
            if (!j1e.z(sx3Var)) {
                zb2Var4.E0.set(false);
                return e5fVar;
            }
            usVar.put(at5Var.a, at5Var);
        }
        this.u0.t0 = new ConcurrentHashMap(usVar);
        if (!j1e.z(sx3Var)) {
            this.u0.E0.set(false);
            return e5fVar;
        }
        at5 at5Var2 = this.u0.D0;
        if (at5Var2 != null) {
            this.u0.t0.put("all.chat.folder", at5Var2);
            if (arrayList.isEmpty()) {
                arrayList.add(at5Var2);
            } else {
                arrayList.add(0, at5Var2);
            }
        }
        this.u0.X.m(null, arrayList);
        if (this.w0) {
            this.u0.x0.e(arrayList2);
        }
        k56 k56Var = this.x0;
        if (k56Var != null) {
            k56Var.invoke();
        }
        this.u0.E0.set(false);
        ArrayList arrayList4 = new ArrayList(this.u0.F0.values());
        this.u0.F0.clear();
        if (!arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((Runnable) it4.next()).run();
            }
        }
        return e5fVar;
    }
}
