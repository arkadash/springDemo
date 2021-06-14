package com.annotations

class Validator {
    /**
     * For every item's property annotated with @AllowedNames has a value specified in that annotation.
     */
    fun isValid(item: Quala): Boolean {
        val fields = item::class.java.declaredFields // using reflection

        for (field in fields) {
            field.isAccessible = true

            for (annotation in field.annotations) {
                val value = field.get(item)

                if (field.isAnnotationPresent(AllowedNames::class.java)) {
                    val allowedNames = field.getAnnotation(AllowedNames::class.java)?.names
                    val name = value as String
                    allowedNames?.let {
                        if (!it.contains(name)) {
                            return false
                        }
                    }
                }
            }
        }
        return true
    }
}