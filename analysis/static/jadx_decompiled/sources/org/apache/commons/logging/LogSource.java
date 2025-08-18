package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.commons.logging.impl.NoOpLog;

@Deprecated
/* loaded from: classes2.dex */
public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Hashtable logs = new Hashtable();
    protected static Constructor logImplctor = null;

    static {
        log4jIsAvailable = false;
        jdk14IsAvailable = false;
        String property = null;
        try {
            Class.forName("org.apache.log4j.Logger");
            log4jIsAvailable = true;
        } catch (Throwable unused) {
            log4jIsAvailable = false;
        }
        try {
            Class.forName("java.util.logging.Logger");
            int i = Jdk14Logger.a;
            jdk14IsAvailable = true;
        } catch (Throwable unused2) {
            jdk14IsAvailable = false;
        }
        try {
            property = System.getProperty("org.apache.commons.logging.log");
            if (property == null) {
                property = System.getProperty(LogFactoryImpl.LOG_PROPERTY);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (property != null) {
                try {
                    setLogImplementation(property);
                } catch (Throwable unused4) {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            } else {
                try {
                    if (log4jIsAvailable) {
                        setLogImplementation("org.apache.commons.logging.impl.Log4JLogger");
                    } else if (jdk14IsAvailable) {
                        setLogImplementation("org.apache.commons.logging.impl.Jdk14Logger");
                    } else {
                        setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                    }
                } catch (Throwable unused5) {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            }
        } catch (Throwable unused6) {
        }
    }

    private LogSource() {
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log logMakeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, logMakeNewLogInstance);
        return logMakeNewLogInstance;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(str);
        } catch (Throwable unused) {
            log = null;
        }
        return log == null ? new NoOpLog(str) : log;
    }

    public static void setLogImplementation(String str) throws LinkageError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            logImplctor = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static void setLogImplementation(Class cls) throws LinkageError, NoSuchMethodException, SecurityException {
        logImplctor = cls.getConstructor("".getClass());
    }
}
