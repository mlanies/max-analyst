package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.dp3;
import defpackage.ema;
import defpackage.fm7;
import defpackage.mq9;
import defpackage.nd2;
import defpackage.o97;
import defpackage.pag;
import defpackage.to6;
import defpackage.v3c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ShrinkDumpWorker extends Worker {
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final fm7 b() {
        String strE = getInputData().e("param_dump_path");
        if (strE == null || strE.length() == 0) {
            return fm7.a();
        }
        String strE2 = getInputData().e("param_tag");
        File file = new File(strE);
        long length = file.length();
        if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            file.delete();
            return fm7.b();
        }
        o97 o97Var = pag.b;
        if (dp3.b(o97Var)) {
            file.delete();
            return fm7.b();
        }
        try {
            File fileH = mq9.h(getApplicationContext(), o97Var);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                int i = to6.w0;
                to6 to6Var = new to6(new DataInputStream(new BufferedInputStream(bufferedInputStream)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileH));
                    try {
                        ema.l(to6Var, bufferedOutputStream, 8192);
                        v3c.i(bufferedOutputStream, null);
                        v3c.i(to6Var, null);
                        file.delete();
                        nd2.i(getApplicationContext(), o97Var, fileH, strE2, Long.valueOf(length), null, 200);
                        return fm7.b();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (IOException unused) {
            return fm7.a();
        }
    }
}
