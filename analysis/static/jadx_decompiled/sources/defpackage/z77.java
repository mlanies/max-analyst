package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class z77 {
    public final Context a;
    public final h45 b;
    public final pb0 c;

    public z77(Context context, h45 h45Var, pb0 pb0Var) {
        this.a = context;
        this.b = h45Var;
        this.c = pb0Var;
    }

    public final void a(hc0 hc0Var, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(hc0Var.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        z8b z8bVar = hc0Var.c;
        adler32.update(byteBufferAllocate.putInt(d9b.a(z8bVar)).array());
        byte[] bArr = hc0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        j1e.m("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", hc0Var);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM = ((gqc) this.b).m();
        String strValueOf = String.valueOf(d9b.a(z8bVar));
        String str = hc0Var.a;
        Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            pb0 pb0Var = this.c;
            builder.setMinimumLatency(pb0Var.a(z8bVar, jLongValue, i));
            Set set = ((qb0) pb0Var.b.get(z8bVar)).c;
            if (set.contains(cuc.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(cuc.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(cuc.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, d9b.a(z8bVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {hc0Var, Integer.valueOf(value), Long.valueOf(pb0Var.a(z8bVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
