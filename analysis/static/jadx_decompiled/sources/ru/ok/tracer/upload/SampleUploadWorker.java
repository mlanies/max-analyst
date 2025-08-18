package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.b46;
import defpackage.bkb;
import defpackage.bw4;
import defpackage.c37;
import defpackage.dy7;
import defpackage.eae;
import defpackage.fm7;
import defpackage.gx3;
import defpackage.j47;
import defpackage.kbd;
import defpackage.ky7;
import defpackage.kye;
import defpackage.lk5;
import defpackage.m6d;
import defpackage.mz7;
import defpackage.n4c;
import defpackage.ote;
import defpackage.oz7;
import defpackage.pq6;
import defpackage.rh5;
import defpackage.rq6;
import defpackage.v3c;
import defpackage.wq6;
import defpackage.x53;
import defpackage.y7g;
import defpackage.yie;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SampleUploadWorker extends Worker {
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final fm7 b() {
        File file;
        File file2 = null;
        try {
            file = new File(getInputData().e("tracer_sample_file_path"));
            try {
            } catch (Exception unused) {
                file2 = file;
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
                return fm7.b();
            }
        } catch (Exception unused2) {
        }
        if (!file.exists()) {
            file.getPath();
            return fm7.b();
        }
        long jD = getInputData().d("tracer_sample_file_size", -1L);
        Long lValueOf = jD > 0 ? Long.valueOf(jD) : null;
        String strE = getInputData().e("tracer_sample_file_name");
        if (ote.u(getApplicationContext().getPackageManager(), getApplicationContext().getPackageName()).getLongVersionCode() != getInputData().d("tracer_version_code", 0L)) {
            file.delete();
            return fm7.b();
        }
        String strC = c(strE, lValueOf);
        if (strC != null) {
            d(file, strC);
        }
        return fm7.b();
    }

    public final String c(String str, Long l) throws JSONException {
        kye kyeVar = kye.a;
        String strA = kye.a();
        if (strA == null) {
            return null;
        }
        ky7 ky7Var = new ky7();
        Object obj = getInputData().a.get("tracer_custom_properties_keys");
        String[] strArr = obj instanceof String[] ? (String[]) obj : null;
        if (strArr == null) {
            strArr = new String[0];
        }
        for (String str2 : strArr) {
            String strE = getInputData().e(str2);
            if (strE != null) {
                ky7Var.put(str2, strE);
            }
        }
        ky7 ky7VarB = ky7Var.b();
        kye kyeVar2 = kye.a;
        kbd kbdVar = kye.e;
        if (kbdVar == null) {
            kbdVar = null;
        }
        yie yieVarC = kbdVar.c();
        if (!ky7VarB.isEmpty()) {
            Map map = yieVarC.m;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ky7VarB);
            linkedHashMap.putAll(map);
            yieVarC = yie.a(yieVarC, false, linkedHashMap, 12287);
        }
        JSONObject jSONObjectQ0 = j47.q0(yieVarC);
        jSONObjectQ0.put("feature", getInputData().e("tracer_feature_name"));
        jSONObjectQ0.put("sampleSize", l);
        jSONObjectQ0.put("sampleFileName", str);
        if (getInputData().b("tracer_has_attr1", false)) {
            jSONObjectQ0.put("attr1", getInputData().d("tracer_attr1", 0L));
        }
        if (getInputData().b("tracer_has_attr2", false)) {
            jSONObjectQ0.put("attr2", getInputData().d("tracer_attr2", 0L));
        }
        if (getInputData().e("tracer_feature_tag") != null) {
            jSONObjectQ0.put("tag", getInputData().e("tracer_feature_tag"));
        }
        Object obj2 = kye.c().get(ote.b);
        if ((obj2 instanceof gx3 ? (gx3) obj2 : null) == null) {
            mz7.d0(new LinkedHashMap());
        }
        bkb bkbVar = new bkb(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/initUpload").appendQueryParameter("sampleToken", strA).toString(), b46.o("application/json; charset=utf-8", jSONObjectQ0.toString()));
        jSONObjectQ0.toString();
        rq6 rq6VarB = ((wq6) kye.h.getValue()).b(bkbVar);
        try {
            rh5 rh5Var = (rh5) rq6VarB.o;
            if (rh5Var == null) {
                v3c.i(rq6VarB, null);
                return null;
            }
            JSONObject jSONObject = new JSONObject(eae.j0((byte[]) rh5Var.c));
            oz7.m(jSONObject, getInputData().e("tracer_feature_name"), getInputData().e("tracer_feature_tag"));
            if (rq6VarB.b != 200) {
                v3c.i(rq6VarB, null);
                return null;
            }
            String string = jSONObject.getString("uploadToken");
            v3c.i(rq6VarB, null);
            return string;
        } finally {
        }
    }

    public final void d(File file, String str) throws IOException {
        byte[] bArr;
        String str2;
        if (getInputData().b("tracer_feature_uze_gzip", true)) {
            Context applicationContext = getApplicationContext();
            String string = getId().toString();
            String strQ = c37.q();
            if (strQ.equals(applicationContext.getPackageName())) {
                str2 = "tracer";
            } else {
                str2 = "tracer-" + Uri.encode(strQ.replace(':', '-'));
            }
            File file2 = new File(applicationContext.getCacheDir(), str2);
            m6d.y(file2);
            File fileJ = lk5.J(file2, string.concat(".tmp"));
            try {
                dy7.z(file, fileJ);
                file.length();
                fileJ.length();
                file.delete();
                file = fileJ;
            } catch (IOException e) {
                fileJ.delete();
                throw e;
            }
        } else {
            file.length();
        }
        kye kyeVar = kye.a;
        Object obj = kye.c().get(ote.b);
        if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
            mz7.d0(new LinkedHashMap());
        }
        String string2 = Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", str).toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pq6("file", "sample", "application/octet-stream", new y7g(file)));
        n4c.a.getClass();
        try {
            rq6 rq6VarB = ((wq6) kye.h.getValue()).b(new bkb(string2, new bw4(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(n4c.b.h())}, 1)), x53.D0(arrayList))));
            try {
                rh5 rh5Var = (rh5) rq6VarB.o;
                oz7.l((rh5Var == null || (bArr = (byte[]) rh5Var.c) == null) ? null : eae.j0(bArr), getInputData().e("tracer_feature_name"), getInputData().e("tracer_feature_tag"));
                v3c.i(rq6VarB, null);
            } finally {
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
        file.delete();
    }
}
