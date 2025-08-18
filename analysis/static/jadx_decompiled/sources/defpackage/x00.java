package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class x00 implements qj3, d38, b66 {
    public final /* synthetic */ y00 a;

    public /* synthetic */ x00(y00 y00Var) {
        this.a = y00Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        y00 y00Var = this.a;
        Throwable th = (Throwable) obj;
        y00Var.getClass();
        hm9.p("AttachPreviewDiskCache", "onError", th);
        ((cba) y00Var.b).c(new HandledException(th), true);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        this.a.getClass();
        HashMap map = new HashMap();
        for (File file : (List) obj) {
            String name = file.getName();
            String str = !name.endsWith(".png") ? null : name.split("_")[1];
            if (!oag.t(str)) {
                map.put(str, Uri.fromFile(file));
            }
        }
        return map;
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        kk5 kk5Var = (kk5) this.a.c;
        kk5Var.getClass();
        File fileG = kk5.g(kk5Var.b(), "previewVideoCache");
        if (!pag.k(fileG) && !j28Var.h()) {
            j28Var.b();
        }
        File[] fileArrListFiles = fileG.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            if (j28Var.h()) {
                return;
            }
            j28Var.b();
            return;
        }
        Arrays.sort(fileArrListFiles, new v00(0));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fileArrListFiles.length && i < 200; i++) {
            arrayList.add(fileArrListFiles[i]);
        }
        if (j28Var.h()) {
            return;
        }
        j28Var.a(arrayList);
    }
}
