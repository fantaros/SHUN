// Avoid `console` errors in browsers that lack a console.
(function() {
    var method,

    methods = [
        'assert', 'clear', 'count', 'debug', 'dir', 'dirxml', 'error',
        'exception', 'group', 'groupCollapsed', 'groupEnd', 'info', 'log',
        'markTimeline', 'profile', 'profileEnd', 'table', 'time', 'timeEnd',
        'timeStamp', 'trace', 'warn'
    ],
    length = methods.length,
    console = (window.console = window.console || {});

    while (length--) {
        method = methods[length];

        // Only stub undefined methods.
        if (!console[method]) {
            // chrome v8 已优化
            console[method] = function() {};
        }
    }
}());

// Place any jQuery/helper plugins in here.
