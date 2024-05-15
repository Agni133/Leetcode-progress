/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    try {
        // Wait for both promises to resolve and get their values
        const value1 = await promise1;
        const value2 = await promise2;

        // Return a new Promise resolving with the sum of the values
        return value1 + value2;
    } catch (error) {
        // If any of the promises reject, catch the error and return a rejected Promise
        return Promise.reject(error);
    }
};
