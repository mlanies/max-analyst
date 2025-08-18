package ru.ok.tracer.disk.usage;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.fl4;
import defpackage.fs4;
import defpackage.gl4;
import defpackage.h8;
import defpackage.khe;
import defpackage.lk5;
import defpackage.nz4;
import defpackage.tpa;
import defpackage.vd6;
import defpackage.x53;
import defpackage.z53;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gl4", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DiskUsageWorker extends Worker {
    public final khe b;

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = new khe(h8.c);
    }

    public static String c(long j, LinkedHashMap linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((vd6) entry.getKey()).a, d((gl4) entry.getValue()));
        }
        jSONObject.put("consumers", jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject d(gl4 gl4Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", gl4Var.a);
        jSONObject.put("name", gl4Var.b);
        if (gl4Var.c) {
            jSONObject.put("is_dir", true);
        }
        if (gl4Var.e) {
            jSONObject.put("is_overflow", true);
        }
        if (gl4Var.f) {
            jSONObject.put("is_excluded", true);
        }
        List list = gl4Var.d;
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.put(d((gl4) it.next())));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static gl4 g(File file, int i, ArrayList arrayList) {
        boolean z;
        ?? arrayList2;
        boolean z2;
        boolean z3;
        List listSubList;
        if (arrayList.contains(file)) {
            Objects.toString(file);
            return new gl4(0L, file.getName(), false, null, false, true, 28);
        }
        if (!file.isDirectory()) {
            return new gl4(file.length(), file.getName(), false, null, false, false, 60);
        }
        try {
            File parentFile = file.getParentFile();
            File file2 = parentFile == null ? file : new File(parentFile.getCanonicalFile(), file.getName());
            z = !tpa.f(file2.getCanonicalFile(), file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        if (z) {
            return new gl4(0L, file.getName(), true, null, false, false, 56);
        }
        File[] fileArrListFiles = file.listFiles();
        nz4 nz4Var = nz4.a;
        if (fileArrListFiles != null) {
            arrayList2 = new ArrayList(fileArrListFiles.length);
            for (File file3 : fileArrListFiles) {
                arrayList2.add(g(file3, i + 1, arrayList));
            }
        } else {
            arrayList2 = nz4Var;
        }
        long j = 4096;
        Iterator it = arrayList2.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((gl4) it.next()).a;
        }
        long j3 = j + j2;
        if (i > 6) {
            file.toString();
            z2 = true;
        } else {
            z2 = false;
            nz4Var = arrayList2;
        }
        List listX0 = x53.x0(nz4Var, new fs4(25));
        if (listX0.size() > 20) {
            file.toString();
            listSubList = listX0.subList(0, 20);
            z3 = true;
        } else {
            z3 = z2;
            listSubList = listX0;
        }
        return new gl4(j3, file.getName(), true, listSubList, z3, false, 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (defpackage.n4c.b.i(r5) == 0) goto L13;
     */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fm7 b() {
        /*
            r8 = this;
            o97 r1 = defpackage.oag.a
            boolean r0 = defpackage.dp3.b(r1)
            if (r0 == 0) goto Ld
            em7 r8 = defpackage.fm7.b()
            return r8
        Ld:
            d24 r0 = r8.getInputData()
            java.lang.String r2 = "probability"
            r3 = 0
            long r5 = r0.d(r2, r3)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1f
            goto Ld0
        L1f:
            if (r0 != 0) goto L22
            goto L31
        L22:
            m4c r0 = defpackage.n4c.a
            r0.getClass()
            d3 r0 = defpackage.n4c.b
            long r5 = r0.i(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld0
        L31:
            android.content.Context r0 = r8.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = r2.dataDir     // Catch: java.lang.Exception -> Lcb
            vd6 r7 = defpackage.vd6.INTERNAL_DATA     // Catch: java.lang.Exception -> Lcb
            r8.e(r6, r7, r5)     // Catch: java.lang.Exception -> Lcb
            r6 = 0
            java.io.File r0 = r0.getExternalFilesDir(r6)     // Catch: java.lang.Exception -> Lcb
            if (r0 == 0) goto L57
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Exception -> Lcb
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> Lcb
            goto L58
        L57:
            r0 = r6
        L58:
            vd6 r7 = defpackage.vd6.EXTERNAL_DATA     // Catch: java.lang.Exception -> Lcb
            r8.e(r0, r7, r5)     // Catch: java.lang.Exception -> Lcb
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lcb
            java.lang.String r2 = r2.sourceDir     // Catch: java.lang.Exception -> Lcb
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lcb
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Exception -> Lcb
            if (r0 == 0) goto L6e
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.Exception -> Lcb
        L6e:
            vd6 r0 = defpackage.vd6.SRC     // Catch: java.lang.Exception -> Lcb
            r8.e(r6, r0, r5)     // Catch: java.lang.Exception -> Lcb
            java.util.Collection r0 = r5.values()     // Catch: java.lang.Exception -> Lcb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lcb
        L7b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> Lcb
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> Lcb
            gl4 r2 = (defpackage.gl4) r2     // Catch: java.lang.Exception -> Lcb
            long r6 = r2.a     // Catch: java.lang.Exception -> Lcb
            long r3 = r3 + r6
            goto L7b
        L8b:
            khe r0 = r8.b     // Catch: java.lang.Exception -> Lcb
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lcb
            fl4 r0 = (defpackage.fl4) r0     // Catch: java.lang.Exception -> Lcb
            r0.getClass()     // Catch: java.lang.Exception -> Lcb
            r6 = 10737418240(0x280000000, double:5.3049894774E-314)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lc6
            android.content.Context r0 = r8.getApplicationContext()     // Catch: java.lang.Exception -> Lcb
            java.io.File r2 = defpackage.mq9.h(r0, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = c(r3, r5)     // Catch: java.lang.Exception -> Lcb
            defpackage.lk5.K(r2, r0)     // Catch: java.lang.Exception -> Lcb
            android.content.Context r0 = r8.getApplicationContext()     // Catch: java.lang.Exception -> Lcb
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r8 = "limit"
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> Lcb
            java.util.Map r5 = java.util.Collections.singletonMap(r8, r3)     // Catch: java.lang.Exception -> Lcb
            r6 = 88
            r3 = 0
            defpackage.nd2.i(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lcb
        Lc6:
            em7 r8 = defpackage.fm7.b()
            return r8
        Lcb:
            cm7 r8 = defpackage.fm7.a()
            return r8
        Ld0:
            em7 r8 = defpackage.fm7.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.disk.usage.DiskUsageWorker.b():fm7");
    }

    public final void e(String str, vd6 vd6Var, LinkedHashMap linkedHashMap) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        ((fl4) this.b.getValue()).getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(lk5.J(file, ((String) it.next()).substring(vd6Var.a.length() + 1)));
        }
        linkedHashMap.put(vd6Var, g(file, 0, arrayList2));
    }
}
