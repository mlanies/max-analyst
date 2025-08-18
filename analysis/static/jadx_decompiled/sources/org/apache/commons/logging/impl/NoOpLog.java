package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes2.dex */
public class NoOpLog implements Log, Serializable {
    public NoOpLog() {
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
    }

    public NoOpLog(String str) {
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th) {
    }
}
