// Original code by amon
// https://softwareengineering.stackexchange.com/a/257454
for (Map.Entry<Integer, Map<Integer, SomeObject<SomeObject, T>>> row : table.entrySet()) {
    final Integer rowKey = entry.getKey();

    final Map<Integer, SomeObject<SomeObject, T>> rowValue = entry.getValue();

    for (Map.Entry<Integer, SomeObject<SomeObject, T>> col : rowValue.entrySet()) {
        final Integer colKey = col.getKey();

        final SomeObject<SomeObject, T> colValue = col.getValue();

        doSomethingWith<SomeObject<SomeObject, T>>(rowKey, colKey, colValue);
    }
}
