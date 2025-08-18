package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class vd extends Handler {
    public static final vd a = new vd();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = ud.a;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strY0 = (String) ud.b.get(loggerName);
        if (strY0 == null) {
            strY0 = w9e.Y0(23, loggerName);
        }
        if (Log.isLoggable(strY0, i)) {
            if (thrown != null) {
                StringBuilder sbO = rh4.o(message, "\n");
                sbO.append(Log.getStackTraceString(thrown));
                message = sbO.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iZ0 = w9e.z0(message, '\n', i2, false, 4);
                if (iZ0 == -1) {
                    iZ0 = length;
                }
                while (true) {
                    iMin = Math.min(iZ0, i2 + 4000);
                    message.substring(i2, iMin);
                    if (iMin >= iZ0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
